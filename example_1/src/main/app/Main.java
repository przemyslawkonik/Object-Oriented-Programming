package main.app;

import main.model.device.Calculator;
import main.model.device.CalculatorImpl;

/**
 * Created by Przemysław Konik on 2017-06-03.
 */
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        calculator.start();
    }
}
