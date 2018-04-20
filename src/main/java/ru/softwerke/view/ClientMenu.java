package ru.softwerke.view;

import ru.softwerke.tools.ReadWriter;
import ru.softwerke.controller.ClientController;

public class ClientMenu {

    public ClientMenu() {}

    public void showClientsMenu() {
        ReadWriter.printLine("Clients menu: \n" +
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
        String firstName = ReadWriter.readLine();
        ReadWriter.printLine("Enter surname:");
        String lastName = ReadWriter.readLine();
        ReadWriter.printLine("Enter middle name:");
        String middleName = ReadWriter.readLine();
        ReadWriter.printLine("Enter birth date (example: dd/MM/yyyy)");
        String localDate = ReadWriter.readLine();

        new ClientController().create(firstName, lastName, middleName, localDate);
    }
}
