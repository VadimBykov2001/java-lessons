package ru.tn.courses.vbykov.v1.task2.enums;

public enum ColorEnum{
    BLACK("Черный"), WHITE("Белый"), BLUE("Синий");
    private final String value;
    ColorEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
