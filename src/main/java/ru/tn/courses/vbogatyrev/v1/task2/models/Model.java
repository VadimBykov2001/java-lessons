package ru.tn.courses.vbogatyrev.v1.task2.models;

public class Model {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public Model(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + id;
    }
}
