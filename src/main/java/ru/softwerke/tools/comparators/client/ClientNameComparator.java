package ru.softwerke.tools.comparators.client;

import ru.softwerke.model.Client;

import java.util.Comparator;

public class ClientNameComparator implements Comparator<Client>{
    @Override
    public int compare(Client client1, Client client2) {
        return client1.getFirstName().compareTo(client2.getFirstName());
    }
}
