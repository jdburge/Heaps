package pq;
/**
 * Heap.java
 * 
 * Abstract class to provide the basic functionality of a heap, to
 * be used, for example, in heapsort or in a priority queue.
 *
 * @author Thomas VanDrunen & Derek Schlabach & Jeff Burge
 * CS 245, Wheaton College, Spring 2007
 * Lab 10
 * March 22, 2007
 * Revised for CSCI 345, Spring 2015
 */

public abstract class Heap {

    /**
     * The array containing the internal data of the heap.
     */
    protected int[] internal;

    /**
     * The portion of the array currently used to store the heap.
     */
    protected int heapSize;

    /**
     * Find the index of the parent of the node at a given index.
     * @param i The index whose parent we want.
     * @return The index of the parent.
     */
    protected int parent(int i) { return (i - 1) / 2; }

    /**
     * Find the index of the left child of the node at a given index.
     * @param i The index whose left child we want.
     * @return The index of the left child.
     */
    protected int left(int i ) { return 2 * i + 1; }

    /**
     * Find the index of the right child of the node at a given index.
     * @param i The index whose right child we want.
     * @return The index of the right child.
     */
    protected int right(int i) { return 2 * i + 2; }

    /**
     * Force the (max-) heap property on the subtree rooted at
     * index i.
     * @param i The index where we want to make a heap.
     * PRECONDITION: The subtrees rooted at the left and right
     * children of i are already heaps.
     * POSTCONDITION: The subtree rooted at i is a heap.
     */
    protected void heapify(int i) {
    	try {
    		if ((internal[i] > internal[left(i)]) && (internal[i] > internal[right(i)]))
    			return;
    		else {
    			int largerChildIndex;
    			if (right(i) >= heapSize)
    				if (left(i) >= heapSize)
    					return;
    				else
    					largerChildIndex = left(i);
    			else
    				largerChildIndex = (internal[left(i)] > internal[right(i)]) ? left(i) : right(i);
    			
    			int temp = internal[i];
    			internal[i] = internal[largerChildIndex];
    			internal[largerChildIndex] = temp;
    			heapify(largerChildIndex);
        	}
    	} catch (IndexOutOfBoundsException e) {
    		return;
    	}

    }
}
