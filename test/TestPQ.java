package test;

import static org.junit.Assert.*;

import pq.PriorityQueue;

import org.junit.Before;
import org.junit.Test;

public class TestPQ extends TestHeapify {

    int[] array = { 33, 22, 66, 99, 11, 88, 55, 77, 44};
    
    @Test
    public void testA() {
        PriorityQueue pq = new PriorityQueue(array.length);
        for (int i = 0; i < 1; i++) 
            pq.insert(array[i]);
         assertEquals(33, pq.extractMax());  
    }
    
    @Test
    public void testB() {
        PriorityQueue pq = new PriorityQueue(array.length);
        for (int i = 0; i < 4; i++) {
            pq.insert(array[i]);
            if (i % 3 == 1)
                pq.extractMax();
        }
        assertEquals(99, pq.extractMax());  
    }
    
    
    @Test
    public void testC() {
        PriorityQueue pq = new PriorityQueue(array.length);
        for (int i = 0; i < 7; i++) {
            pq.insert(array[i]);
            if (i % 3 == 1)
                pq.extractMax();
        }
        assertEquals(88, pq.extractMax());  
    }
    
    @Test
    public void testD() {
        PriorityQueue pq = new PriorityQueue(array.length);
        for (int i = 0; i < array.length; i++) {
            pq.insert(array[i]);
            if (i % 3 == 1)
                pq.extractMax();
        }
        assertEquals(77, pq.extractMax());  
        assertEquals(66, pq.extractMax());  
        assertEquals(55, pq.extractMax());  
        assertEquals(44, pq.extractMax());  
        assertEquals(22, pq.extractMax());  
        assertEquals(11, pq.extractMax());  
    }
    
    
   

        
}
