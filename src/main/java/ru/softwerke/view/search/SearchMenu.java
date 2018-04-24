package ru.softwerke.view.search;

import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.Returner;

public class SearchMenu implements Returner {
    private SearchClientMenu searchClientMenu;

    public SearchMenu() {
        this.searchClientMenu =  new SearchClientMenu();
    }

    public void showSearchMenu() {
        ReadWriter.printLine("Search menu: \n" +
            "1. Search client \n" +
            "2. Search device \n" +
            "3. Search purchase \n" +
            "4. Back ro main menu");

        String operation = ReadWriter.readLine();

        switch (operation) {
            case "1":
                searchClientMenu.showSearchClientMenu();
                break;
            case "2":
                //
                break;
            case "3":
                //
                break;
            case "4":
                returnToInitMenu();
        }
    }

}
