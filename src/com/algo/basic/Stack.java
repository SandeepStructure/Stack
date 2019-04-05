package com.algo.basic;

public class Stack {

    int maxSize;
    long[] stackContainer;
    int top;

    Stack(int size){
        this.maxSize=size;
        this.stackContainer=new long[maxSize];
        this.top = -1;
    }

    public void push(long value){
        top++;
        stackContainer[top]=value;
    }

    public long pop(){
        long oldValue = stackContainer[top];
        top--;
        return oldValue;
    }

    public long peak(){
        return stackContainer[top];
    }
    public boolean isEmpty(){
        return top == 0;
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }
}
