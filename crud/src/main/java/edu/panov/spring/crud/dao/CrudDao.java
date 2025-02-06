package edu.panov.spring.crud.dao;

import java.util.List;
import java.util.Optional;

public interface CrudDao<T> {

    List<T> findAll();

    void add(T obj);

    Optional<T> get(int id);

    void delete(int id);

}
