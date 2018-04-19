package ru.softwerke.controller;

import ru.softwerke.model.Client;
import ru.softwerke.model.Database;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.parsers.DateParser;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ClientController extends InitController {

    public ClientController() {}

    public void create(String firstName, String lastName, String middleName, String localDate) {
        try{
        LocalDate birthDate = DateParser.getDate(localDate);

        Database.clientList.add(new Client.Builder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setBirthDate(birthDate)
                .setMiddleName(middleName)
                .build());
        ReadWriter.printLine("Client was created");
        initMenu.showInitMenu();
        } catch (DateTimeParseException e) {
            ReadWriter.printLine("Wrong entry, new client was not created. \n" +
                                        "Please, write the date as 'dd/MM/yyyy'. \n");
            initMenu.showInitMenu();
        }
    }

    public void delete(int id) {
        Database.clientList.remove(id);
        System.out.println("Client was deleted");
        initMenu.showInitMenu();
    }
}
