package ru.softwerke.view.sort;

import ru.softwerke.controller.sort.ClientSortController;
import ru.softwerke.model.Client;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.Returner;

import java.util.ArrayList;
import java.util.List;

public class ClientSortMenu implements Returner {
    private static ClientSortController clientSortController = ClientSortController.getClientSortController();
    private List<Client> clients = new ArrayList<>();

    public void showClientsSortMenu() {
        ReadWriter.printLine("Clients sort menu: \n" +
                "1. Sort by name \n" +
                "2. Sort by surname \n" +
                "3. Sort by birthday \n" +
                "4. Go back");
        String operation = ReadWriter.readLine();

        switch (operation) {
            case "1":
                sortByFirstName();
                break;
            case "2":
                sortByLastName();
                break;
            case "3":
                sortByBirthDate();
                break;
            case "4":
                returnToInitMenu();
                default:
                    wrongEntry();
                    break;
        }
    }

    private void sortByFirstName() {
        clients.clear();
        ClientSortController.sortByName().forEach(clients::add);
        print();
    }

    private void sortByLastName() {
        clients.clear();
        ClientSortController.sortBySurname().forEach(clients::add);
        print();
    }

    private void sortByBirthDate() {
        clients.clear();
        ClientSortController.sortByBDay().forEach(clients::add);
        print();
    }

    private void print() {
        for (Client client: clients) {
            ReadWriter.printLine(client);
        }
        returnToInitMenu();
    }
}
