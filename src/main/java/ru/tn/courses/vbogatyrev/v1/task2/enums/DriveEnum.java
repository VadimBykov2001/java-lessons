package ru.tn.courses.vbogatyrev.v1.task2.enums;

public enum DriveEnum {
    FULL("полный"), FRONT("передний"), REAR("задний");

    private final String value;

    DriveEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
