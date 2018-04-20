package ru.softwerke.model.DAO;

import ru.softwerke.model.Client;
import ru.softwerke.tools.ReadWriter;

import java.util.ArrayList;
import java.util.List;

public class ClientDAO {
    private static List<Client> clientList = new ArrayList();

    public static List<Client> getClientsList() {
        return clientList;
    }

    public static void showClientsList() {
        for (Client client: clientList) {
            ReadWriter.printLine(client);
        }
    }

}
