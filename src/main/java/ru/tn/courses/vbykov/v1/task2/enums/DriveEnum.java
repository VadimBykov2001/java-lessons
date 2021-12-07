package ru.tn.courses.vbykov.v1.task2.enums;

public enum DriveEnum {
    FULL("полный привод"), FRONT("передний привод"), REAR("задний привод");

    private final String value;

    DriveEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
