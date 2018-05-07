package ru.softwerke.view;

import ru.softwerke.controller.SaleController;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.Returner;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SaleMenu implements Returner {

    public void saleMenu() {
        ReadWriter.printLine("Sales menu: \n" +
            "1. Make a purchase \n" +
            "2. Show sales history \n" +
            "3. Sort sales history \n" +
            "4. Search in sales history \n" +
            "5. Back to main menu");
        String operation = ReadWriter.readLine();
        switch (operation) {
            case "1":
                // make a purchase
            case "2":
                // show sales history
            case "3":
                // sort sales history
            case "4":
                // search in sales history
            case "5":
                returnToInitMenu();
        }
    }

    public void createSale(boolean exist) {
        boolean add = true;
        Map<Integer, Integer> devicePool = new HashMap<>();
        LocalDate localDate = LocalDate.now();

        ReadWriter.printLine("Enter client id who makes purchase:");
        int clientId = Integer.parseInt(ReadWriter.readLine());

        if (exist) {
            while (add) {
                ReadWriter.printLine("Enter device id you want to buy:");
                int deviceId = Integer.parseInt(ReadWriter.readLine());
                ReadWriter.printLine("Enter number of device you want to buy:");
                int numberOfDevice = Integer.parseInt(ReadWriter.readLine());
                ReadWriter.printLine("Do you want to add more items? \n" +
                        "If yes print '1' if not press 'enter':");
                int answer = Integer.parseInt(ReadWriter.readLine());
                if (answer != 1) {
                    add = false;
                }
            }
        }

        if (exist) {
//            new SaleController().create();
        }



    }
}
