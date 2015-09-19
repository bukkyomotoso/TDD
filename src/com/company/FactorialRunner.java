package com.company;

/**
 * Created by GRACE on 9/19/2015.
 */
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;

public class FactorialRunner {
    public static void main(String[]args) {
        Result result = JUnitCore.runClasses(FactorialTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
