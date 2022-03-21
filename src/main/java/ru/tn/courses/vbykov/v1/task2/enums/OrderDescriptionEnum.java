package ru.tn.courses.vbykov.v1.task2.enums;

public enum OrderDescriptionEnum {
    CREATE("Создание заказа"), RETURN("Возврат продукта"), MODIF("Изменение заказа"), BUY("Произведение покупки");
    private final String value;
    OrderDescriptionEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
