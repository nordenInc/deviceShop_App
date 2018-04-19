package ru.softwerke.tools;

import java.util.Scanner;

public class ReadWriter {

    private static Scanner scanner = new Scanner(System.in);

    public static String readLine() {
        return scanner.nextLine();
    }

    public static void printLine(String string) {
        System.out.println(string);;
    }

}
