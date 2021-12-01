package ru.tn.courses.vbykov.v1.task2.models;

public class Customer extends Model{
    String name;
    Double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Customer(Integer id, String name, Double money) {
        super(id);
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return super.toString() + "; name: " + name + "; money: " + money + "\n";
    }
}
