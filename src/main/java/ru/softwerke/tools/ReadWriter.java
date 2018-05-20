package ru.softwerke.tools;

import ru.softwerke.model.Client;
import ru.softwerke.model.Device;
import ru.softwerke.model.Sale;

import java.util.Scanner;

/**
 * Tool for getting info from user and giving processed data
 */

public class ReadWriter {

    private static Scanner scanner = new Scanner(System.in);

    public static String readLine() {
        return scanner.nextLine();
    }

    private static void print(String sout) {
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

    /**
     * To get 'yes' or 'no' answer from user
     * @return statement
     */

    public static boolean fork() {
        while (true) {
            print("Enter yes or no to continue or exit");
            String fork = readLine();
            if ("yes".equalsIgnoreCase(fork)) {
                return true;
            } else if ("no".equalsIgnoreCase(fork)) {
                return false;
            } else {print("Wrong entry");}
        }
    }

}
