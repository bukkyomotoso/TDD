package com.company;

/**
 * Created by GRACE on 9/19/2015.
 */
import org.junit.Test;
import static  org.junit.Assert.assertEquals;

public class FactorialTest {
    int number = 5;
    Factorial factorial = new Factorial(number);

        @Test
            public void testFactorial(){
            assertEquals(120,factorial.computeFactorial());
            }
}
