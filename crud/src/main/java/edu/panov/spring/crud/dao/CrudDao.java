package edu.panov.spring.crud.dao;

import java.util.List;

public interface CrudDao<T> {

    List<T> findAll();

}
