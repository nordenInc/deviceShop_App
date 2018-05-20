package ru.softwerke.model;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Sale entity
 */

public class Sale {

    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    private int clientSaleId;
    private Client client;
    private List<Device> deviceList;
    private LocalDate localDate;

    public Sale(Client client, List<Device> deviceList, LocalDate localDate) {
        this.clientSaleId = atomicInteger.incrementAndGet();
        this.client = client;
        this.deviceList = deviceList;
        this.localDate = localDate;
    }

    public Sale() {}

    public int getClientSaleId() {
        return clientSaleId;
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

    @Override
    public String toString() {
        return  "Sale Id: " + clientSaleId + "\n" +
                "Client: " + client + "\n" +
                "Bought devices: " + deviceList + "\n" +
                "Purchase time: " + localDate + "\n" + "\n";
    }
}
