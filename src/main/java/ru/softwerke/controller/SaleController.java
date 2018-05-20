package ru.softwerke.controller;

import ru.softwerke.model.Client;
import ru.softwerke.model.Device;
import ru.softwerke.model.Sale;
import ru.softwerke.model.dao.ClientList;
import ru.softwerke.model.dao.DeviceList;
import ru.softwerke.model.dao.SaleList;
import ru.softwerke.tools.ReadWriter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Controller for create and show sales
 */

public class SaleController extends InitController {
    private SaleList saleList = new SaleList();
    private ClientList clientList = new ClientList();

    /**
     * Add new purchase to list
     *
     * @param clientId
     * @param devicePool
     * @param purchaseDate
     */

    public void create(int clientId, Map<Integer, Integer> devicePool, LocalDate purchaseDate) {
        List<Device> deviceList = new ArrayList<>();
        boolean clientExist = clientList.exist(clientId);
        Client client;
        if (clientExist) {
            client = clientList.search(clientId);
            for (Map.Entry<Integer, Integer> entry : devicePool.entrySet()) {
                int deviceId = entry.getKey();
                int numberOfDevice = entry.getValue();
                if (DeviceList.exist(deviceId)) {
                    Device device = DeviceList.getDevice(deviceId);
                    deviceList.add(device);
                } else {
                    ReadWriter.printLine("Device with " + deviceId + " number doesn't exist");
                    initMenu.showInitMenu();
                }
            }
            Sale sale = new Sale(client, deviceList, purchaseDate);
            saleList.addSale(sale);
            ReadWriter.printLine("Purchase was created");
            initMenu.showInitMenu();
        } else {
            ReadWriter.printLine("Client with id " + clientId + "doesn't exist");
            initMenu.showInitMenu();
        }
    }

    /**
     * Show original sales list
     */

    public void showNotSortedSales() {
        SaleList.showSaleList();
        initMenu.showInitMenu();
    }

}
