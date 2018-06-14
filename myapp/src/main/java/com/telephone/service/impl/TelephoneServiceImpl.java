package com.telephone.service.impl;

import com.telephone.dao.TelephoneDao;
import com.telephone.model.Telephone;
import com.telephone.service.ITelephoneService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TelephoneServiceImpl implements ITelephoneService {
    @Resource
    TelephoneDao telephoneDao;

    @Override
    public void save(Telephone telephone) {
        telephoneDao.save(telephone);
    }

    @Override
    public void delete(Integer index) {
        telephoneDao.delete(index);
    }

    @Override
    public List<Telephone> getAll() {
        return telephoneDao.getAll();
    }

}
