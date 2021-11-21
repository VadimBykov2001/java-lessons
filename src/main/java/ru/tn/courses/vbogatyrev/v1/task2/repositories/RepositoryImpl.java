package ru.tn.courses.vbogatyrev.v1.task2.repositories;

import java.util.List;

public class RepositoryImpl<T> implements Repository<T> {
    private List<T> repository;

    public RepositoryImpl(List<T> repository) {
        this.repository = repository;
    }

    @Override
    public List<T> findAll() {
        return repository;
    }

    @Override
    public void save(T var) {
        repository.add(var);
    }

    @Override
    public void update(T var, Integer id) {
        repository.set(id, var);
    }


    @Override
    public T findById(Integer id) {
        return repository.get(id);
    }

    @Override
    public Integer getSize() {
        return repository.size();
    }
}
