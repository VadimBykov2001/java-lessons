package ru.tn.courses.vbykov.v1.task2.enums;

public enum BrandEnum {
    Samsung("Самсунг"), Apple("Эппел"), Xiaomi("Ксяоми");
    private final String value;
    BrandEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
