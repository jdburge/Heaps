package pq;
/**
 * PriorityQueue.java
 *
 * Class to implement a priority queue using a (max) heap.
 *
 * @author Thomas VanDrunen
 * CS 245, Wheaton College, Spring 2007
 * Lab 10
 * Mar 21, 2007
 * Revised for CSCI 345, Spring 2015
 */

public class PriorityQueue extends Heap {

    /**
     * Constructor. Initialize this pq to empty.
     * @param maxSize The capacity of this priority queue.
     */
    public PriorityQueue(int maxSize) {
        internal = new int[maxSize];
        heapSize = 0;
    }

    /**
     * Is this pq empty?
     * It is if its heap size is zero.
     * @return True if this is empty, false otherwise.
     */
    public boolean isEmpty() {
        return heapSize == 0;
    }

    /**
     * Is this pq full?
     * It is if its heap size is equal to the array's size.
     * @return True if this is full, false otherwise.
     */
    public boolean isFull() {
        return heapSize == internal.length;
    }

    /**
     * Insert a new item into this pq.
     * @param x The item to insert.
     */
    public void insert(int x) {

     // finish this in part 5

    }

    /**
     * Return (but do not remove) the maximum element.
     * According to the (max-) heap property, the maximum element
     * should be at position 0.
     * @return The maximum element.
     */
    public int max() { return internal[0]; }


    /**
     * Return and remove the maximum element.
     * @return The maximum element.
     */
    public int extractMax() {

        int toReturn = internal[0];

         // finish this in part 5

        return toReturn;
    }

}
