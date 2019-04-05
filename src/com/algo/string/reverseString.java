package com.algo.string;

public class reverseString {
    private static String reverseString(String value){
        Stack stack = new Stack(value.length());
        String result = "";
        for(int i =0;i<value.length();i++){
            stack.push(value.charAt(i));
        }

        for(int j=0;j<stack.stackContainer.length;j++){

            result = result + stack.pop();
        }
        return result;

    }
    public static void main(String[] args){
        System.out.println(reverseString("Sandeep"));
    }
}
