package com.nyota.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    DataService ds;

    @Override
    public void getAddition(int a, int b) {
        System.out.println (ds.calculateSum(a, b));

    }
    
}
