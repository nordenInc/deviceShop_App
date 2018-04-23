package ru.softwerke.model.dao;

import ru.softwerke.model.Client;
import ru.softwerke.tools.ReadWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClientList {
    private static List<Client> clientList = new ArrayList();

    public static List<Client> getClientsList() {
        return clientList;
    }

    public static void showClientsList() {
        for (Client client: clientList) {
            ReadWriter.printLine(client);
        }
    }

    public static boolean exist(int id) {
        int value = clientList
                .stream()
                .filter(s -> s.getClientId() == id)
                .collect(Collectors.toList())
                .size();
        if (value > 0) {return true;}
        else return false;
    }
}