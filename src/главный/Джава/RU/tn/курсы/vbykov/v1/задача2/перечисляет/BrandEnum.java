package ru.tn.courses.vbykov.v1.task2.enums;

public enum BrandEnum {
    KIA("киа"), Lada("лада"), Toyota("тойота");

    private final String value;

    BrandEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
