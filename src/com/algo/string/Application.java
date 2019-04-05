package com.algo.string;

public class Application {
    public static void main(String[] args){
        Stack stack = new Stack(7);
        stack.push('S');
        stack.push('A');
        stack.push('N');
        stack.push('D');
        stack.push('E');
        stack.push('E');
        stack.push('P');

        System.out.println(stack.peak());
    }
}
