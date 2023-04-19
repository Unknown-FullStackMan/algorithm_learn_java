package com.simple.queue;

/**
 * @Author Simple.Mu
 * @Date 2023/4/17 23:20
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);

        arrayQueue.addQueue(1);
        arrayQueue.addQueue(2);
        arrayQueue.addQueue(3);
        arrayQueue.addQueue(4);
        arrayQueue.addQueue(5);

        System.out.println(arrayQueue.getQueue());
        System.out.println(arrayQueue.getQueue());
        System.out.println(arrayQueue.getQueue());

        arrayQueue.frontQueue();

        arrayQueue.findQueue();
    }
}
