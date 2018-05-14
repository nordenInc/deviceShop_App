package ru.softwerke.model;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Sale {

    private static AtomicLong atomicLong = new AtomicLong(0);;
    private long clientSaleId;
    private Client client;
    private List<Device> deviceList;
    private LocalDate localDate;

    public Sale(Client client, List<Device> deviceList, LocalDate localDate) {
        this.clientSaleId = atomicLong.incrementAndGet();
        this.client = client;
        this.deviceList = deviceList;
        this.localDate = localDate;
    }

    public Sale() {}

    public long getClientSaleId() {
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

    @Override
    public String toString() {
        return  "Sale Id: " + clientSaleId + "\n" +
                "Client: " + client + "\n" +
                "Bought devices: " + deviceList + "\n" +
                "Purchase time: " + localDate + "\n" + "\n";
    }
}
