package ru.softwerke.view;

import ru.softwerke.tools.ReadWriter;
import ru.softwerke.controller.ClientController;

import java.util.Scanner;

public class ClientMenu {

    public ClientMenu() {}

    public void showClientsMenu() {
        System.out.println("Clients menu: \n" +
                            "1. Create new client \n" +
                            "2. Delete client \n" +
                            "3. Update client \n" +
                            "4. Show all clients");

        String operation = ReadWriter.readLine();

        switch (operation) {
            case "1":
                createClient();
                break;
            case "2":
                // delete client
            case "3":
                // update client
            case "4":
                // show clients
        }
    }

    public void createClient() {
        ReadWriter.printLine("Enter name:");
        String firstName = readLine();
        ReadWriter.printLine("Enter surname:");
        String lastName = readLine();
        ReadWriter.printLine("Enter middle name:");
        String middleName = readLine();
        ReadWriter.printLine("Enter birth date (example: dd/MM/yyyy)");
        String localDate = readLine();

        new ClientController().create(firstName, lastName, middleName, localDate);
    }

    public String readLine() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }
}
