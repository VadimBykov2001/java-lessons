package ru.tn.courses.vbogatyrev.v1.task2.business;

import ru.tn.courses.vbogatyrev.v1.task2.enums.OrderDescriptionEnum;
import ru.tn.courses.vbogatyrev.v1.task2.models.Customer;
import ru.tn.courses.vbogatyrev.v1.task2.models.Order;
import ru.tn.courses.vbogatyrev.v1.task2.models.Product;
import ru.tn.courses.vbogatyrev.v1.task2.repositories.CustomerRepository;
import ru.tn.courses.vbogatyrev.v1.task2.repositories.OrderRepository;
import ru.tn.courses.vbogatyrev.v1.task2.repositories.ProductRepository;

import java.time.LocalDate;
import java.util.List;

public class MyShop implements InternetShop {
    OrderRepository orderRepository = OrderRepository.getInstance();
    ProductRepository productRepository = ProductRepository.getInstance();
    CustomerRepository customerRepository = CustomerRepository.getInstance();

    @Override
    public Order createOrder(Integer productId, String customerName) throws Exception {
        Customer customer = customerRepository.findByName(customerName);
        try {
            Product product = productRepository.findById(productId);
            Order order =
                    new Order(orderRepository.getSize(), customer, product, OrderDescriptionEnum.CREATE.getValue());
            orderRepository.save(order);
            return order;
        } catch (Exception e) {
            throw new Exception("товар с таким id не найден");
        }
    }

    @Override
    public Order payment(Integer orderId) throws Exception {
        try {
            Order order = orderRepository.findById(orderId);
            order.setDescription(OrderDescriptionEnum.BUY.getValue());
            Customer customer = customerRepository.findById(order.getCustomer().getId());
            Product product = productRepository.findById(order.getProduct().getId());
            if (product.getCount() > 0) {
                product.setCount(product.getCount() - 1);
            } else {
                throw new Exception("товара больше нет");
            }
            if (order.getProduct().getPrice() > customer.getMoney()) {
                throw new Exception("на вашем счете недосаточного денег");
            }
            productRepository.update(product, product.getId());
            order.setPayment(order.getProduct().getPrice());
            customer.setMoney(customer.getMoney() - order.getProduct().getPrice());
            customerRepository.update(customer, customer.getId());

            return order;
        } catch (IndexOutOfBoundsException e) {
            throw new Exception("заказ с таким id не найден");
        }
    }

    @Override
    public Order returnProduct(Integer orderId) throws Exception {
        try {
            Order order = orderRepository.findById(orderId);
            order.setDescription(OrderDescriptionEnum.RETURN.getValue());
            orderRepository.update(order, orderId);
            return order;
        } catch (Exception e) {
            throw new Exception("заказа с таким id не найдено.");
        }
    }

    @Override
    public Order modifOrder(Integer orderId, Integer newProductId) throws Exception {
        try {
            Product newProduct = productRepository.findById(newProductId);
            Order order = orderRepository.findById(orderId);
            order.setModified(LocalDate.now());
            order.setProduct(newProduct);
            order.setDescription(OrderDescriptionEnum.MODIF.getValue());
            return order;
        } catch (Exception e) {
            throw new Exception("товар или заказ с таким id не найдено");
        }
    }

    @Override
    public List<Product> catalog() {
        return productRepository.findAll();
    }
}
