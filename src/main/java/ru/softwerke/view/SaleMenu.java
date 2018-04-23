package ru.softwerke.view;

import ru.softwerke.tools.ReadWriter;

public class SaleMenu {


    public void saleMenu() {
        ReadWriter.printLine("Sales menu: \n" +
            "1. Make a purchase \n" +
            "2. Show sales history");
        String operation = ReadWriter.readLine();
        switch (operation) {
            case "1":
                // make a purchase
            case "2":
                // show sales history
        }
    }

    public void createSale() {


    }
}
