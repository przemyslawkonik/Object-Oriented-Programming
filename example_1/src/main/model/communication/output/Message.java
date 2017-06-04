package main.model.communication.output;

import main.model.device.Calculator;

/**
 * Created by Przemysław Konik on 2017-06-04.
 */
public interface Message {

    void printManual();
    void printEnterOperation();
    void printErrorOperation();
    void printErrorDivision();
    void printResult(Calculator calculator);
}
