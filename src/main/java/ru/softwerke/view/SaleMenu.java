package ru.softwerke.view;

import ru.softwerke.controller.SaleController;
import ru.softwerke.model.dao.ClientList;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.Returner;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SaleMenu implements Returner {
    private ClientList clientList = new ClientList();

    public void showSaleMenu() {
        ReadWriter.printLine("Sales menu: \n" +
            "1. Make a purchase \n" +
            "2. Show sales history \n" +
            "3. Sort sales history \n" +
            "4. Search in sales history \n" +
            "5. Back to main menu");
        String operation = ReadWriter.readLine();
        switch (operation) {
            case "1":
                createSale();
                break;
            case "2":
                showSalesHistory();
                break;
            case "3":
                // sort sales history
                break;
            case "4":
                // search in sales history
                break;
            case "5":
                returnToInitMenu();
                break;
                default:
                    wrongEntry();
                    break;
        }
    }

    private void createSale() {
        boolean add = true;

        Map<Integer, Integer> devicePool = new HashMap<>();

        ReadWriter.printLine("Enter client id who want to make purchase:");
        int clientId = Integer.parseInt(ReadWriter.readLine());
        boolean exist = clientList.exist(clientId);

        if (exist) {
            while (add) {
                ReadWriter.printLine("Enter device id you want to buy:");
                int deviceId = Integer.parseInt(ReadWriter.readLine());
                ReadWriter.printLine("Enter number of device you want to buy:");
                int numberOfDevice = Integer.parseInt(ReadWriter.readLine());
                devicePool.put(deviceId, numberOfDevice);
                add = ReadWriter.fork();
            }
        }
        LocalDate purchaseDate = LocalDate.now();
        new SaleController().create(clientId, devicePool, purchaseDate);
    }

    private void showSalesHistory() {
        new SaleController().showNotSortedSales();
    }
}
