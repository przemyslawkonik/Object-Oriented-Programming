package main.model.communication;

import main.model.communication.input.Input;

/**
 * Created by Przemysław Konik on 2017-06-04.
 */
public class Program {

    private static final String end = "exit";

    public static boolean isEnd() {
        return end.equals(Input.get());
    }

    public static void end() {
        System.exit(0);
    }
}
