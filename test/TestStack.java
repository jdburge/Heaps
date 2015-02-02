package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pq.PQStack;

public class TestStack extends TestHeapify {


    int[] array = { 33, 22, 66, 99, 11, 88, 55, 77, 44};
    
    @Test
    public void testA() {
        PQStack pqst = new PQStack(array.length);
        for (int i = 0; i < 2; i++) 
            pqst.push(array[i]);
         assertEquals(22, (int) pqst.pop());  
    }
    
    @Test
    public void testB() {
        PQStack pqst = new PQStack(array.length);
        for (int i = 0; i < 4; i++) {
            pqst.push(array[i]);
            if (i % 3 == 1)
                pqst.pop();
        }
        assertEquals(99, (int)pqst.pop());  
    }
    
    
    @Test
    public void testC() {
        PQStack pqst = new PQStack(array.length);
        for (int i = 0; i < 7; i++) {
            pqst.push(array[i]);
            if (i % 3 == 1)
                pqst.pop();
        }
        assertEquals(55, (int)pqst.pop());  
    }
    
    @Test
    public void testD() {
        PQStack pqst = new PQStack(array.length);
        for (int i = 0; i < array.length; i++) {
            pqst.push(array[i]);
            if (i % 3 == 1)
                pqst.pop();
        }
        assertEquals(44, (int)pqst.pop());  
        assertEquals(55, (int)pqst.pop());  
        assertEquals(88, (int)pqst.pop());  
        assertEquals(99, (int)pqst.pop());  
        assertEquals(66, (int)pqst.pop());  
        assertEquals(33, (int)pqst.pop());  
    }
    

}
