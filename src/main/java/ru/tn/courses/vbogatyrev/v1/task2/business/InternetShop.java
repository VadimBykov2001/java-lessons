package ru.tn.courses.vbogatyrev.v1.task2.business;
import ru.tn.courses.vbogatyrev.v1.task2.models.Order;
import ru.tn.courses.vbogatyrev.v1.task2.models.Product;
import java.util.List;

public interface InternetShop {
    Order createOrder(Integer productId, String customer) throws Exception;
    Order payment(Integer orderId) throws Exception;
    Order returnProduct(Integer orderId) throws Exception;
    Order modifOrder(Integer orderId, Integer productId) throws Exception;
    List<Product> catalog();
}
