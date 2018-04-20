package ru.softwerke.model;

import java.time.LocalDate;

public class Sale {

    private static int id = 0;
    private int clientSaleId;
    private Client client;
    private Device device;
    private LocalDate localDate;

    public Sale(Client client, Device device, LocalDate localDate) {
        this.clientSaleId = id++;
        this.client = client;
        this.device = device;
        this.localDate = localDate;
    }

    public Sale() {}


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

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
