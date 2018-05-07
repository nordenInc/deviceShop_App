package ru.softwerke.view.sort;

import ru.softwerke.controller.sort.ClientSortController;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.Returner;

public class ClientSortMenu implements Returner {
    private static ClientSortController clientSortController = ClientSortController.getClientSortController();

    public void showClientsSortMenu() {
        ReadWriter.printLine("Clients sort menu: \n" +
                "1. Sort by name \n" +
                "2. Sort by surname \n" +
                "3. Sort by birthday \n" +
                "4. Go back");
        String operation = ReadWriter.readLine();

        switch (operation) {
            case "1":
                clientSortController.sortByName();
                break;
            case "2":
                clientSortController.sortBySurname();
                break;
            case "3":
                clientSortController.sortByBDay();
                break;
            case "4":
                returnToInitMenu();
        }
    }
}
