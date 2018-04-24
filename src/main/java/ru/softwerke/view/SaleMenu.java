package ru.softwerke.view;

import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.Returner;

public class SaleMenu implements Returner {

    public void saleMenu() {
        ReadWriter.printLine("Sales menu: \n" +
            "1. Make a purchase \n" +
            "2. Show sales history \n" +
            "3. Back to main menu");
        String operation = ReadWriter.readLine();
        switch (operation) {
            case "1":
                // make a purchase
            case "2":
                // show sales history
            case "3":
                returnToInitMenu();
        }
    }

    public void createSale() {

    }
}
