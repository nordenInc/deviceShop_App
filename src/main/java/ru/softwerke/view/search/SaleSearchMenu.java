package ru.softwerke.view.search;

import ru.softwerke.controller.search.SaleSearchController;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.Returner;

public class SaleSearchMenu implements Returner {
    public void showSalesSearchMenu() {
        ReadWriter.printLine("Sales search menu: \n" +
                "1. Search by id \n" +
                "2. Search by purchase date \n" +
                "3. Go back");

        String operation = ReadWriter.readLine();

        switch (operation) {
            case "1":
                searchId();
                break;
            case "2":
                searchPurchaseDate();
                break;
            case "3":
                returnToInitMenu();
                break;
            default:
                wrongEntry();
                break;
        }
    }

    private void searchId() {
        ReadWriter.printLine("Enter sale id you want to find:");
        String id = ReadWriter.readLine();
        new SaleSearchController().searchById(id);
    }

    private void searchPurchaseDate() {
        ReadWriter.printLine("Enter purchase date you want to find:");
        String localDate = ReadWriter.readLine();
        new SaleSearchController().searchByPurchaseDate(localDate);
    }
}
