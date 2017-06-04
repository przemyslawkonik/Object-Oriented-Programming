package main.model.communication.input;

import java.util.Scanner;

/**
 * Created by Przemysław Konik on 2017-06-04.
 */
public class Input {

    private static String input;

    private static final String pattern = "\\d+(\\.\\d+)?([+\\-*/]\\d+(\\.\\d+)?)*";

    public static String enter() { return input = new Scanner(System.in).nextLine(); }

    public static String get() {
        return input;
    }

    public static String set(String input) { return Input.input = input; }

    public static boolean isEligibleForProcess() {
        return input.matches(pattern);
    }
}
