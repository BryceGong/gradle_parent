package com.bryce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {

    @Autowired
    DataDao dataDao;

    public String getData() {
        return dataDao.getData();
    }
}
