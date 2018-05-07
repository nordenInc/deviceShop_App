package ru.softwerke.controller;

import com.sun.org.apache.regexp.internal.RE;
import ru.softwerke.model.Client;
import ru.softwerke.model.dao.ClientList;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.parsers.DateParser;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ClientController extends InitController {

    public ClientController() {}

    public void create(String firstName, String lastName, String middleName, String localDate) {
        try{
        LocalDate birthDate = DateParser.getDate(localDate);

        ClientList.getClientsList().add(new Client.Builder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setBirthDate(birthDate)
                .setMiddleName(middleName)
                .build());
        ReadWriter.printLine("Client was created");
        ClientList.showClientsList();
        initMenu.showInitMenu();
        } catch (DateTimeParseException e) {
            ReadWriter.printLine("Wrong entry, new client was not created. \n" +
                                        "Please, write the date as 'dd/MM/yyyy'. \n");
            initMenu.showInitMenu();
        }
    }

    public void delete(int id) {
        ClientList.getClientsList().remove(id);
        ReadWriter.printLine("Client was deleted");
        initMenu.showInitMenu();
    }

    public void update(int id, String firstName, String lastName, String middleName, String localDate) {
        Client client = ClientList.getClientsList().get(id);

        if (ClientList.exist(id)) {
            try {
                LocalDate birthDay = DateParser.getDate(localDate);
                client.setFirstName(firstName);
                client.setLastName(lastName);
                client.setMiddleName(middleName);
                client.setBirthDate(birthDay);
                ReadWriter.printLine("Client was updated");
                initMenu.showInitMenu();
            } catch (DateTimeParseException e) {
                ReadWriter.printLine("Wrong entry, new client was not created. \n" +
                        "Please, write the date as 'dd/MM/yyyy'. \n");
                initMenu.showInitMenu();
            }
        } else {
            ReadWriter.printLine("Wrong client id!");
            initMenu.showInitMenu();
        }
    }

    public void showNotSortedClients() {
        ClientList.showClientsList();
        initMenu.showInitMenu();
    }
}
