/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queue;

/**
 *
 * @author bacht
 */
public class Queue {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        System.out.println("Size of the queue: " + queue.size()); // Output: Size of the queue: 3
        System.out.println("Front item: " + queue.peek()); // Output: Front item: 1
        
        int dequeuedItem = queue.dequeue();
        System.out.println("Dequeued item: " + dequeuedItem); // Output: Dequeued item: 1
    }
}
