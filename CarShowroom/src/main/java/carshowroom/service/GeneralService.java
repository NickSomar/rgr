package carshowroom.service;

import carshowroom.model.Client;
import carshowroom.model.Rent;

import java.util.List;

public interface GeneralService<T> {

    void save(T t);

    List<T> findAll();

    T findById(Long id);

    void delete(Long id);

    T update(T t, Long id);
}
