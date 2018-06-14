package com.telephone.service;

import com.telephone.model.Telephone;

import java.util.List;

public interface ITelephoneService {
    void save(Telephone telephone);

    void delete(Integer index);

    List<Telephone> getAll();
}
