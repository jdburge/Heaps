package pq;
/**
 * Stack.java
 *
 * Class to implement the stack datastructure using a priority queue.
 * 
 * @author Thomas VanDrunen
 * CS 245, Wheaton College, Spring 2007
 * Lab 10
 * Mar 21, 2007
 */

import java.util.HashMap;

import adt.Stack;

public class PQStack implements Stack<Integer> {

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
     * @param maxSize The capacity of this stack.
     */
    public PQStack(int maxSize) {
        pq = new PriorityQueue(maxSize);
        satelliteData = new HashMap<Integer, Integer>();
    }

    /**
     * Is this stack empty? It is if the pq is empty.
     * @return True if this is empty, false otherwise.
     */
    public boolean isEmpty() { return pq.isEmpty(); }

    /**
     * Is this stack full? It is if the pq is full.
     * @return True if this is full, false otherwise.
     */
    public boolean isFull() { return pq.isFull(); }

    /**
     * Retrieve (but do not remove) the top element of this stack.
     * @return The top element.
     */
    public Integer top() { 
         return 0; // delete this line
    }

    /**
     * Retreive and remove the top element of this stack.
     * @return The top element.
     */
    public Integer pop() {
         return 0;  // delete this line
    }

    /**
     * Add an element to this stack.
     * @param x The element to add.
     */
    public void push(Integer x) {


    }

}


