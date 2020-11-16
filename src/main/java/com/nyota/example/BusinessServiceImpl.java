package com.nyota.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    DataService ds;

    @Override
    public long getAddition(int a, int b) {
        return (ds.calculateSum(a, b));

    }
    
}
