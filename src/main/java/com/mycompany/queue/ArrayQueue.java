/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queue;

/**
 *
 * @author bacht
 */
public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    
    public ArrayQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == queue.length;
    }
    
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        
        rear = (rear + 1) % queue.length;
        queue[rear] = item;
        size++;
    }
    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        
        int item = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return item;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        
        return queue[front];
    }
    
    public int size() {
        return size;
    }
}

