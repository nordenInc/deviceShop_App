package ru.softwerke.controller.sort;

import ru.softwerke.controller.InitController;
import ru.softwerke.model.Client;
import ru.softwerke.model.dao.ClientList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Controller for client sort with params:
 * (name, surname, birthday)
 */

public class ClientSortController extends InitController {

    public static List<Client> sortByName() {
         return ClientList.getClientStream().sorted(Comparator.comparing(Client::getFirstName))
                .collect(Collectors.toList());
    }

    public static List<Client> sortBySurname() {
        return ClientList.getClientStream().sorted(Comparator.comparing(Client::getLastName))
                .collect(Collectors.toList());
    }

    public static List<Client> sortByBDay() {
        return ClientList.getClientStream().sorted(Comparator.comparing(Client::getBirthDate))
                .collect(Collectors.toList());
    }
}
