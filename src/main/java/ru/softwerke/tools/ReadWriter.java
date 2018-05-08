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

    public static void print(String sout) {
        System.out.println(sout);
    }

    public static void printLine(String string) {
        print(string);
    }

    public static void printLine(Client client) {
        print(client.toString());
    }

    public static void printLine(Device device) {
        print(device.toString());
    }

    public static void printLine(Sale sale) {
        print(sale.toString());
    }

}
