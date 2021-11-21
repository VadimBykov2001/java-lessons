package ru.tn.courses.vbogatyrev.v1.task2.repositories;

import ru.tn.courses.vbogatyrev.v1.task2.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository extends RepositoryImpl<Customer> {

    private static CustomerRepository instance;

    public static CustomerRepository getInstance() {
        if (instance == null) {
            instance = new CustomerRepository();
        }
        return instance;
    }

    public CustomerRepository() {
        super(new ArrayList<>());
        save(new Customer(getSize(), "Валик", 10000.0));
        save(new Customer(getSize(), "Леха", 100.0));
    }

    public Customer findByName(String name) throws Exception {
        List<Customer> allCustomer = findAll();
        for (Customer customer : allCustomer) {
            if (customer.getName().equals(name))
                return customer;
        }
        throw new Exception("Покупателя с таким именем не найдено.");
    }
}
