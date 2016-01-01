package com.math.utility;

public class MathUtility {

    public int addIntegers(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }    

    public int factorial(int n) {
        int result = 1;        
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }        
        return result;
    }
}