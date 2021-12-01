package ru.tn.courses.vbogatyrev.v1.task2.enums;

public enum TransmissionEnum {

    MANUAL("механическая"), AUTOMATIC("автоматическая");

    private final String value;

    TransmissionEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
