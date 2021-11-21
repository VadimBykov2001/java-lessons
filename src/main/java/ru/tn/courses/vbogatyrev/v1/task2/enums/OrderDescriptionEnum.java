package ru.tn.courses.vbogatyrev.v1.task2.enums;

public enum OrderDescriptionEnum {
    CREATE("Создание заказа"), RETURN("возврат продукта"), MODIF("изменение заказа"), BUY("произведена покупка");

    private final String value;

    OrderDescriptionEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
