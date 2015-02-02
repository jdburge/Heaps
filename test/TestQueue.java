package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pq.PQQueue;

public class TestQueue extends TestHeapify {


    int[] array = { 33, 22, 66, 99, 11, 88, 55, 77, 44};
    
    @Test
    public void testA() {
        PQQueue pqq = new PQQueue(array.length);
        for (int i = 0; i < 1; i++) 
            pqq.enqueue(array[i]);
         assertEquals(33, (int) pqq.remove());  
    }
    
    @Test
    public void testB() {
        PQQueue pqq = new PQQueue(array.length);
        for (int i = 0; i < 4; i++) {
            pqq.enqueue(array[i]);
            if (i % 3 == 1)
                pqq.remove();
        }
        assertEquals(22, (int)pqq.remove());  
    }
    
    
    @Test
    public void testC() {
        PQQueue pqq = new PQQueue(array.length);
        for (int i = 0; i < 7; i++) {
            pqq.enqueue(array[i]);
            if (i % 3 == 1)
                pqq.remove();
        }
        assertEquals(66, (int)pqq.remove());  
    }
    
    @Test
    public void testD() {
        PQQueue pqq = new PQQueue(array.length);
        for (int i = 0; i < array.length; i++) {
            pqq.enqueue(array[i]);
            if (i % 3 == 1)
                pqq.remove();
        }
        assertEquals(99, (int)pqq.remove());  
        assertEquals(11, (int)pqq.remove());  
        assertEquals(88, (int)pqq.remove());  
        assertEquals(55, (int)pqq.remove());  
        assertEquals(77, (int)pqq.remove());  
        assertEquals(44, (int)pqq.remove());  
    }
    
    

}
