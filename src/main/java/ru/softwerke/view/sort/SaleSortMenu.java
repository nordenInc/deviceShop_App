package ru.softwerke.view.sort;

import ru.softwerke.controller.sort.SaleSortController;
import ru.softwerke.model.Sale;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.Returner;

import java.util.ArrayList;
import java.util.List;

public class SaleSortMenu implements Returner {
    private List<Sale> sales = new ArrayList<>();

    public void showSalesSortMenu() {
        ReadWriter.printLine("Sales sort menu: \n" +
                "1. Sort by id \n" +
                "2. Sort by purchase date \n" +
                "3. Go back");
        String operation = ReadWriter.readLine();

        switch (operation) {
            case "1":
                sortById();
                break;
            case "2":
                sortByPurchaseDate();
                break;
            case "3":
                returnToInitMenu();
            default:
                wrongEntry();
                break;
        }
    }

    private void sortById() {
        sales.clear();
        SaleSortController.sortById().forEach(sales::add);
        print();
    }

    private void sortByPurchaseDate() {
        sales.clear();
        SaleSortController.sortByPurchaseDate().forEach(sales::add);
        print();
    }

    private void print() {
        for (Sale sale: sales) {
            ReadWriter.printLine(sale);
        }
        returnToInitMenu();
    }

}
