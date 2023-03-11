package com.simple.stack;

/**
 * @Author Simple
 * @Create 2023/3/9 13:32
 */
public class ArrayStack {

    /**
     * 栈的大小
     */
    private int maxStack;

    /**
     * 数组模拟栈
     */
    private int[] stack;

    /**
     * 表示栈顶位置，默认情况下如果没有数据时，使用-1表示
     */
    private int top = -1;

    public ArrayStack(int maxStack) {
        this.maxStack = maxStack;
        stack = new int[maxStack];
    }

    /**
     * 栈满
     * @return
     */
    public boolean isFull() {
        return this.top == this.maxStack -1;
    }

    /**
     * 栈空
     */
    public boolean isEmpty() {
        return this.top == -1;
    }


    /**
     * 压栈
     */
    public void push(int val) {
        if(isFull()) {
            throw new RuntimeException("stack is full");
        }
        top ++;
        stack[top] = val;
    }


    /**
     * 出栈
     */
    public int pop() {
        if(isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        int value = stack[top];
        top --;
        return value;
    }


    /**
     * 查看栈中数据
     */
    public void list() {
        if(isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        for (int i = 0; i < stack.length; i++) {
            System.out.printf("stack[%d]=%d\n",i,stack[i]);
        }
    }

    /**
     * 栈中数据的个数
     * @return
     */
    public int length() {
        return this.top + 1;
    }

}
