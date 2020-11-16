package com.nyota.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExampleConfiguration.class) 
public class BusinessServiceTest {
    @Autowired 
       private BusinessService service; 

       @Test 
       public void testCalculateSum() { 
         long sum = service.getAddition(30, 40); 
         assertEquals(70, sum); 
        } 
}
