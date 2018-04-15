package ru.softwerke.controller;

import ru.softwerke.model.Client;
import ru.softwerke.model.Database;

import java.time.LocalDate;

public class ClientController extends InitController {

    public ClientController() {}

    public void create(String firstName, String lastName, String middleName, LocalDate birthDate) {
        Database.clientList.add(new Client(firstName, lastName, middleName, birthDate));
        System.out.println("Client was created");
    }

    public void delete(Integer id) {
        Database.clientList.remove(id);
        System.out.println("Client was deleted");
    }
}
