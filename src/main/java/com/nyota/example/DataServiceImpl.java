package com.nyota.example;

import org.springframework.stereotype.Component;


@Component
public class DataServiceImpl implements DataService {

    @Override
    public long calculateSum(int a, int b) {
        long c = a + b;
        return c;
    }
    
}
