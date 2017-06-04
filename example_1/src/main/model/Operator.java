package main.model;

/**
 * Created by Przemysław Konik on 2017-06-03.
 */
public enum Operator {

    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    SEPARATOR('.');

    private char operator;

    private Operator(char operator) {
        this.operator = operator;
    }

    public char get() {
        return operator;
    }

    @Override
    public String toString() {
        return ""+operator;
    }
}
