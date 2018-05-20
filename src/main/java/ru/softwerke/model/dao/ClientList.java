package ru.softwerke.model.dao;

import ru.softwerke.model.Client;
import ru.softwerke.tools.ReadWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Client data storage
 */

public class ClientList {
    private static List<Client> clientList = new ArrayList<>();

    public static List<Client> getClientsList() {
        return clientList;
    }

    public static void showClientsList() {
        for (Client client: clientList) {
            ReadWriter.printLine(client);
        }
    }

    /**
     * To search client in list by id
     *
     * @param id
     * @return
     */

    public Client search(int id) {
        return clientList.get(id);
    }

    /**
     * To check if client exists in list
     *
     * @param id
     * @return statement
     */

    public static boolean exist(int id) {
        int value = clientList
                .stream()
                .filter(s -> s.getClientId() == id)
                .collect(Collectors.toList())
                .size();
        if (value > 0) {return true;}
        else return false;
    }

    /**
     * Use for sort and search, in purpose not to change original client list
     *
     * @return client stream
     */

    public static Stream<Client> getClientStream() {
        return clientList.stream();
    }


}
