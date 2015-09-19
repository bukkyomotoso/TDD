package com.company;

/**
 * Created by GRACE on 9/19/2015.
 */
public class Factorial {
   private int number;

    //Constructor
    public Factorial(int number) {

        this.number = number;
    }

    //Compute Factorial
    public int computeFactorial(){
        int fact = 1;
        for(int i = 1; i <=number; i++) {
            fact *= i;
        }
        return fact;

}
}
