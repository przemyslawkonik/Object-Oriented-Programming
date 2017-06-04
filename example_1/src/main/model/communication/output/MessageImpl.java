package main.model.communication.output;

import main.model.device.Calculator;

/**
 * Created by Przemysław Konik on 2017-06-04.
 */
public class MessageImpl implements Message {

    @Override
    public void printManual() { System.out.println("Type 'exit' to end program. Start with number, end with number. Avaliable operators: + - * / ."); }

    @Override
    public void printEnterOperation() {
        System.out.println("Enter operation: ");
    }

    @Override
    public void printErrorOperation() {
        System.out.println("Invalid operation! Try again!");
    }

    @Override
    public void printErrorDivision() {
        System.out.println("Division by zero is forbidden");
    }

    @Override
    public void printResult(Calculator calculator) {
        System.out.println("Result: " + calculator.getResult());
    }
}
