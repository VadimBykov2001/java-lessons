package ru.tn.courses.vbogatyrev.v1.task2.enums;

public enum BrandEnum {
    AUDI("ауди"), VAZ("вишневая семерка"), BMW("бмв");

    private final String value;

    BrandEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
