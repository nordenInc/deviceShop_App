package ru.softwerke.tools.comparators.client;

import ru.softwerke.model.Client;

import java.util.Comparator;

public class ClientSurnameComparator implements Comparator<Client> {
    @Override
    public int compare(Client client1, Client client2) {
        return client1.getLastName().compareTo(client2.getLastName());
    }
}
