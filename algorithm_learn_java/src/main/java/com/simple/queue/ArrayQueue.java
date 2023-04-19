package com.simple.queue;

/**
 * @Author Simple.Mu
 * @Date 2023/4/17 23:13
 * @Description
 */
public class ArrayQueue {

    private int[] array;
    private int maxSize;

    private int front;
    private int rear;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        front = -1;
        rear = -1;
    }


    /**
     * 判断当前队列是否已满
     */
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    /**
     * 判断是否为空队列
     */
    public boolean isEmpty() {
        return front == rear;
    }

    /**
     * 入队
     */
    public void addQueue(int val) {
        if (isFull()) {
            System.out.println("queue is full");
            return;
        }
        rear++;
        array[rear] = val;
    }

    /**
     * 出队
     */
    public int getQueue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        front++;
        return array[front];

    }

    /**
     * 查看队列元素
     */
    public void findQueue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        for (int i = front+1; i < array.length; i++) {
            System.out.printf("array[%d]=%d\n", i, array[i]);
        }
    }


    /**
     * 查看对头元素
     */
    public void frontQueue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return;
        }
        System.out.println(array[front+1]);
    }

}
