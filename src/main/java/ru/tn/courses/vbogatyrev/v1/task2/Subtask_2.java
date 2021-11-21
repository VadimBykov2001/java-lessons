package ru.tn.courses.vbogatyrev.v1.task2;

import ru.tn.courses.vbogatyrev.v1.task2.business.InternetShop;
import ru.tn.courses.vbogatyrev.v1.task2.business.MyShop;
import ru.tn.courses.vbogatyrev.v1.task2.models.Customer;
import ru.tn.courses.vbogatyrev.v1.task2.repositories.CustomerRepository;
import ru.tn.courses.vbogatyrev.v1.task2.repositories.OrderRepository;

import java.util.Scanner;

public class Subtask_2 {

    /**
     * - Необходимо разработать модель (класс) описывающий товар из интернет магазина (можно взять на свой выбор:
     * телефоны, машины). - Необходимо разработать интерфейс для обработки заказов интернет магазина. - Реализовать
     * классы обработки событий: создание заказа, изменения по заказу, возврат заказа. - Необходимо оформить все
     * перечисления через enum - Вынести общую логику в абстракцию
     */
    public static void main(String[] args) {

        OrderRepository orderRepository = OrderRepository.getInstance();
        CustomerRepository customerRepository = CustomerRepository.getInstance();

        InternetShop shop = new MyShop();
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите команду: \n" + "exit: выйти\n" + "help: справка\n" + "create: создать заказ\n" +
                           "return: вернуть товар\n" + "modif: изменить заказ\n" + "payment: оплатить\n" +
                           "catalog: вывести католог товаров\n" + "orders: вывести список заказов\n");
        while (true) {
            try {
                switch (scanner.nextLine()) {
                    case "help":
                        System.out.println("exit: выйти\n" + "help: справка\n" + "create: создать заказ\n" +
                                           "return: вернуть товар\n" + "modif: изменить заказ\n" +
                                           "payment: оплатить\n" + "catalog: вывести католог товаров\n" +
                                           "orders: вывести список заказов\n" + "reg: регистрация пользователя\n" +
                                           "users: список пользователей");
                        break;
                    case "exit":
                        System.exit(1);
                        break;
                    case "create":
                        System.out.println("введите свое имя: ");
                        String customerName = scanner.nextLine();
                        System.out.println("выберите товар который хотите купить: (введите id товара для покупки)");
                        System.out.println(shop.catalog());
                        shop.createOrder(Integer.valueOf(scanner.nextLine()), customerName);
                        System.out.println("Заказ был успешно создан");
                        break;
                    case "orders":
                        System.out.println(orderRepository.findAll());
                        break;
                    case "catalog":
                        System.out.println(shop.catalog());
                        break;
                    case "modif":
                        System.out.println("введите id заказа");
                        Integer orderId = Integer.valueOf(scanner.nextLine());
                        System.out.println("выберите товар который хотите купить:");
                        System.out.println(shop.catalog());
                        shop.modifOrder(orderId, Integer.valueOf(scanner.nextLine()));
                        System.out.println("заказ успешно изменен");
                        break;
                    case "payment":
                        System.out.println("введите id заказа");
                        orderId = Integer.valueOf(scanner.nextLine());
                        shop.payment(orderId);
                        System.out.println("оплата успешно произведена");
                        break;
                    case "return":
                        System.out.println("введите id заказа:");
                        shop.returnProduct(Integer.valueOf(scanner.nextLine()));
                        System.out.println("возврат успешно выполнен");
                        break;
                    case "reg":
                        System.out.println("введите имя");
                        String name = scanner.nextLine();
                        System.out.println("введите скок денег на счету XD");
                        customerRepository.save(new Customer(customerRepository.getSize(), name, Double.valueOf(scanner.nextLine())));
                        System.out.println("пользователь успешно создан");
                        break;
                    case "users":
                        System.out.println(customerRepository.findAll());
                        break;
                    default:
                        System.out.println("команда не понятна, help - справка");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
