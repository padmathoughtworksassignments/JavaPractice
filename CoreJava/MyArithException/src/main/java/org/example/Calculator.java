package org.example;

import java.lang.Math;

public class Calculator {
    double calculatePower2(int input)
    {

        if (input == 0) {
            throw new ZeroException("Zero not allowed");
        }
        else if (input < 0) {
            throw new NegativeException("Negative not allowed");
        }

        return (Math.pow(input,2));
    }
}
