package ru.softwerke.view.search;

import ru.softwerke.controller.search.ClientSearchController;
import ru.softwerke.tools.ReadWriter;

public class SearchClientMenu {


    public void showSearchClientMenu() {
        ReadWriter.printLine("Client search menu: \n" +
            "1. Search by id \n" +
            "2. Search by name \n" +
            "3. Search by surname \n" +
            "4. Search by birthday");

        String operation = ReadWriter.readLine();

        switch (operation) {
            case "1":
                // search by id
                break;
            case "2":
                // search by name
                break;
            case "3":
                // search by surname
                break;
            case "4":
                // search by birthday
                break;
        }
    }

    private void searchById() {
        ReadWriter.printLine("Enter clients id you want to find:");
        String id = ReadWriter.readLine();
//        new ClientSearchController().searchById(id);
    }
}
