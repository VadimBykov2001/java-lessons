package ru.tn.courses.vbykov.v1.task2.enums;

public enum OperatingSystemEnum {
    Android("Андроид"), Ubuntu Touch("Убунту Тоуч"), SIRIN OS("СИРИН ОС");
    private final String value;
    OperatingSystemEnum(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
