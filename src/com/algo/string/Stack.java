package com.algo.string;

public class Stack {
    int maxSize;
    char[] stackContainer;
    int top;

    Stack(int size){
        this.maxSize=size;
        this.stackContainer= new char[maxSize];
        this.top = -1;
    }

    public void push(char value){
        if(!isFull()) {
            top++;
            stackContainer[top] = value;
        }
    }

    public char pop(){
        if(!isEmpty()) {
            char oldValue = stackContainer[top];
            top--;
            return oldValue;
        }else{
            System.out.println("Stack is Empty !!");
            return 'o';
        }
    }

    public char peak(){
        return stackContainer[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize -1;
    }
}
