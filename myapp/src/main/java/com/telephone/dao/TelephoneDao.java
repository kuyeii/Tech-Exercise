package com.telephone.dao;

import com.telephone.model.Telephone;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TelephoneDao {

    private static List<Telephone> telephones = new ArrayList<>();

    public void save(Telephone telephone) {
        telephones.add(telephone);
    }

    public void delete(Integer index) {
        for (int i = 0; i < telephones.size(); i++) {
            if (i == index) {
                telephones.remove(i);
            }
        }
    }

    public List<Telephone> getAll() {
        return telephones;
    }
}
