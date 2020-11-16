package com.nyota.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Developing a est for the business service with mokito
 */
@RunWith(MockitoJUnitRunner.class);
public class BusinessServiceMokitoTest {
    @Mock 
    private DataService dataService; 

     @InjectMocks       
    private BusinessService service = new BusinessServiceImpl(); 
      
      @Test 
      public void testCalculateSum() { 
        BDDMockito.given(dataService.calculateSum(10, 20)).willReturn(Long.valueOf(30)); 
       } 
}
