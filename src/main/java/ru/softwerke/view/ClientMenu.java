package ru.softwerke.view;

import ru.softwerke.controller.ClientController;
import ru.softwerke.controller.Reader;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ClientMenu implements Reader {

    public ClientMenu() {}

    public void showClientsMenu() {
        System.out.println("Clients menu: \n" +
                            "1. Create new client \n" +
                            "2. Delete client \n" +
                            "3. Update client");

        String operation = readLine();

        switch (operation) {
            case "1":
                createClient();
                break;
            case "2":
                // delete client
            case "3":
                // update client
        }
    }

    public void createClient() {
        System.out.println("Enter name:");
        String firstName = readLine();
        System.out.println("Enter surname:");
        String lastName = readLine();
        System.out.println("Enter middle name:");
        String middleName = readLine();
        System.out.println("Enter birth date (example: dd/MM/yyyy)");
        String birthDate = readLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localBirthDate = LocalDate.parse(birthDate, formatter);

        new ClientController().create(firstName, lastName, middleName, localBirthDate);
    }

    @Override
    public String readLine() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }
}
