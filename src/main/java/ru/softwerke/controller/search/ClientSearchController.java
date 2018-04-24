package ru.softwerke.controller.search;

import ru.softwerke.model.Client;
import ru.softwerke.model.dao.ClientList;

import java.util.ArrayList;
import java.util.List;

public class ClientSearchController {
    private static List<Client> searchedClientsList = new ArrayList<>();

//    public List<Client> searchById(String id) {
//        int searchedId = Integer.parseInt(id);
//
//        searchedClientsList.clear();
//        for (Client client: ClientList.getClientsList()) {
//            if (client.getClientId().equals(searchedId)) {
//                searchedClientsList.add(client);
//            }
//        }
//        return searchedClientsList;
//    }
}
