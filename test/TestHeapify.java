package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import pq.Heap;

public class TestHeapify {


    private void heapify(final int[] array, final int i, final int size) {
        new Heap() {
            void testHeapify() {
                internal = array;
                heapSize = size;
                heapify(i);
            }
        }.testHeapify();
    }
    
    @Test
    public void testTrivial() {
        int[] array = { 5 };
        heapify(array, 0, 1);
        assertEquals(array[0], 5);
    }

    
    
    @Test
    public void testSmallAlreadyHeap() {
        int[] array = {13, 12, 5};
        heapify(array, 0, 3);
        assertEquals(array[0], 13);
        assertEquals(array[1], 12);
        assertEquals(array[2], 5);
    }
   
    
    @Test
    public void testSmallHeapBothViolate() {
        int[] array = {5, 12, 13};
        heapify(array, 0, 3);
        assertEquals(array[0], 13);
        assertEquals(array[1], 12);
        assertEquals(array[2], 5);
    }

    @Test
    public void testSmallHeapLeftViolates() {
        int[] array = {5, 12, 3};
        heapify(array, 0, 3);
        assertEquals(array[0], 12);
        assertEquals(array[1], 5);
        assertEquals(array[2], 3);
    }

    @Test
    public void testSmallHeapRightViolates() {
        int[] array = {5, 2, 13};
        heapify(array, 0, 3);
        assertEquals(array[0], 13);
        assertEquals(array[1], 2);
        assertEquals(array[2], 5);
    }

    @Test
    public void testLargeFullAlreadyHeap() {
        int[] array = { 8, 4, 7, 3, 1, 6, 2};
        heapify(array, 0, 7);
        assertEquals(array[0], 8);
        assertEquals(array[1], 4);
        assertEquals(array[2], 7);
        assertEquals(array[3], 3);
        assertEquals(array[4], 1);
        assertEquals(array[5], 6);
        assertEquals(array[6], 2);
    }

    @Test
    public void testLargeNonFullAlreadyHeap() {
        int[] array = { 8, 4, 7, 3, 1, 6, 2, 2};
        heapify(array, 0, 7);
        assertEquals(array[0], 8);
        assertEquals(array[1], 4);
        assertEquals(array[2], 7);
        assertEquals(array[3], 3);
        assertEquals(array[4], 1);
        assertEquals(array[5], 6);
        assertEquals(array[6], 2);
        assertEquals(array[7], 2);
    }

    @Test
    public void testGivenExample() {
        int[] array = {10, 13, 17, 11, 7, 3, 15, 1, 9, 5 };
        heapify(array, 0, 10);
        assertEquals(array[0], 17);
        assertEquals(array[1], 13);
        assertEquals(array[2], 15);
        assertEquals(array[3], 11);
        assertEquals(array[4], 7);
        assertEquals(array[5], 3);
        assertEquals(array[6], 10);
        assertEquals(array[7], 1);
        assertEquals(array[8], 9);
        assertEquals(array[9], 5);
    }

    @Test
    public void testIgnoreNoiseBelow() {
        int[] array = {10, 13, 17, 11, 7, 3, 15, 1, 9, 5, 71, 82, 3, 99, 1 };
        heapify(array, 0, 10);
        assertEquals(array[0], 17);
        assertEquals(array[1], 13);
        assertEquals(array[2], 15);
        assertEquals(array[3], 11);
        assertEquals(array[4], 7);
        assertEquals(array[5], 3);
        assertEquals(array[6], 10);
        assertEquals(array[7], 1);
        assertEquals(array[8], 9);
        assertEquals(array[9], 5);
        assertEquals(array[10], 71);
        assertEquals(array[11], 82);
        assertEquals(array[12], 3);
        assertEquals(array[13], 99);
        assertEquals(array[14], 1);
    }

    @Test
    public void testNoiseWithin() {
        int[] array = { 2, 10, 99, 17, 13, 27, 81, 3, 15, 11 };
        heapify(array, 1, 10);
        assertEquals(array[0], 2);
        assertEquals(array[1], 17);
        assertEquals(array[2], 99);
        assertEquals(array[3], 15);
        assertEquals(array[4], 13);
        assertEquals(array[5], 27);
        assertEquals(array[6], 81);
        assertEquals(array[7], 3);
        assertEquals(array[8], 10);
        assertEquals(array[9], 11);

    }
}