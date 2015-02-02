package pq;
/**
 * PQQueue.java
 *
 * Class to implement the queue data structure using a priority queue.
 * 
 * @author Thomas VanDrunen
 * CS 245, Wheaton College, Spring 2007
 * Lab 10
 * Revised for CSCI 345, Spring 2015
 * Project 2
 */

import java.util.HashMap;

import adt.Queue;

public class PQQueue implements Queue<Integer> {

    /**
     * The priority queue to use as an internal representation.
     */
    private PriorityQueue pq;

    /**
     * Place to store data associated with representative
     * values in the priority queue.
     */
    private HashMap<Integer, Integer> satelliteData;


    /**
     * Constructor.
     * @param maxSize The capacity of this queue.
     */
    public PQQueue(int maxSize) {
        pq = new PriorityQueue(maxSize);
        satelliteData = new HashMap<Integer, Integer>();
    }

    /**
     * Is this queue empty? It is if the pq is empty.
     * @return True if this is empty, false otherwise.
     */
    public boolean isEmpty() { return pq.isEmpty(); }

    /**
     * Is this queue full? It is if the pq is full.
     * @return True if this is full, false otherwise.
     */
    public boolean isFull() { return pq.isFull(); }

    /**
     * Retrieve (but do not remove) the front element of this queue.
     * @return The front element.
     */
    public Integer front() { 

          return 0; // delete this line
    }

    /**
     * Retrieve and remove the front element of this queue.
     * @return The front element.
     */
    public Integer remove() {

       return 0;  // delete this line
    }

    /**
     * Add an element to the back of this queue.
     * @param x The element to add.
     */
    public void enqueue(Integer x) {

       

    }

}
