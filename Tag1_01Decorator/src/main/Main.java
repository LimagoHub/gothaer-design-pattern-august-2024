package main;

import client.CalcClient;
import math.*;

public class Main {
    public static void main(String[] args) {
        CalculatorFactory.setLogger(true);
        CalculatorFactory.setSecure(true);
        Calculator calculator = CalculatorFactory.getCalculator();

        CalcClient client = new CalcClient(calculator);
        client.go();
    }
}