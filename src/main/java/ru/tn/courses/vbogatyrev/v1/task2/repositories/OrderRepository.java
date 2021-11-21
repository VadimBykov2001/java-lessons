package ru.tn.courses.vbogatyrev.v1.task2.repositories;

import ru.tn.courses.vbogatyrev.v1.task2.models.Order;

import java.util.ArrayList;

public class OrderRepository extends RepositoryImpl<Order> {

    private static OrderRepository instance;

    public static OrderRepository getInstance(){
        if(instance == null){
            instance = new OrderRepository();
        }
        return instance;
    }

    public OrderRepository() {
        super(new ArrayList<>());
    }
}
