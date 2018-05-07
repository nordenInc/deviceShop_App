package ru.softwerke.model;

import java.time.LocalDate;
import java.util.List;

public class Sale {

    private static int id = 0;
    private int clientSaleId;
    private Client client;
    private List<Device> deviceList;
    private LocalDate localDate;

    public Sale(Client client, List<Device> deviceList, LocalDate localDate) {
        this.clientSaleId = id++;
        this.client = client;
        this.deviceList = deviceList;
        this.localDate = localDate;
    }

    public Sale() {}

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Sale.id = id;
    }

    public int getClientSaleId() {
        return clientSaleId;
    }

    public void setClientSaleId(int clientSaleId) {
        this.clientSaleId = clientSaleId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Device> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<Device> deviceList) {
        this.deviceList = deviceList;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
