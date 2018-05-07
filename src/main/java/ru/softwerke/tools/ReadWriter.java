package ru.softwerke.tools;

import ru.softwerke.model.Client;
import ru.softwerke.model.Device;
import ru.softwerke.model.Sale;

import java.util.Scanner;

public class ReadWriter {

    private static Scanner scanner = new Scanner(System.in);

    public static String readLine() {
        return scanner.nextLine();
    }

    public static void printLine(String string) {
        System.out.println(string);
    }

    public static void printLine(Client client) {
        System.out.println(client);
    }

    public static void printLine(Device device) {
        System.out.println(device);
    }

    public static void printLine(Sale sale) {
        System.out.println(sale);
    }

}
