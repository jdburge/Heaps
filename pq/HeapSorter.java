package pq;
/**
 * HeapSorter.java
 *
 * Class to implement the heapsort algorithm.
 *
 * @author Thomas VanDrunen
 * CS 245, Wheaton College, Spring 2007
 * Lab 10
 * Mar 21, 2007
 */

public class HeapSorter extends Heap {

    /**
     * Constructor. Take an array an sets it up as a (max-) heap.
     * @param internal The array to be used for the internal representation.
     */
    private HeapSorter(int[] internal) {
        this.internal = internal;
        heapSize = internal.length;
        internalToHeap(0);
    }
    
    private void internalToHeap(int i) {
    	int count = 0;
    	while (left(i) < heapSize) {
    		count++;
    		i = left(i);
    	}
    	while (count > 0) {
    		i = parent(i);
    		internalToHeap(right(i));
    		heapify(i);
    		count--;
    	}
    	
    }

    /**
     * Sort this array, in place.
     * @param array The array to sort.
     */
    public static void sort(int[] array) {
    
        HeapSorter heap = new HeapSorter(array);
        /*int heapSize = heap.heapSize;
        while (heapSize > 0) {
        	int bottomIndex = heapSize - 1;
        	int temp = heap.internal[0];
        	heap.internal[0] = heap.internal[bottomIndex];
        	heap.internal[bottomIndex] = temp;
        	heapSize--;
        	heap.heapify(0);
        }*/


    }
}
