package ru.tn.courses.vbykov.v1.task2.enums;

public enum DisplayResolutionEnum {
    	STANDART ("1080×1920"), PLUS("1440 x 2960");
    private final String value;
    TransmissionEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
