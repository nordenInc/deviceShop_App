package ru.softwerke.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Device {
    private static int id = 0;
    private int deviceId;
    private String manufacturer;
    private String deviceType;
    private String deviceModel;
    private String deviceColor;
    private LocalDate releaseDate;
    private BigDecimal price;

    public Device(String manufacturer, String deviceType, String deviceModel, String deviceColor, LocalDate releaseDate, BigDecimal price) {
        this.deviceId = id++;
        this.manufacturer = manufacturer;
        this.deviceType = deviceType;
        this.deviceModel = deviceModel;
        this.deviceColor = deviceColor;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    public Device() {}

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceModel() {return deviceModel;}

    public void setDeviceModel(String deviceModel) {this.deviceModel = deviceModel;}

    public String getDeviceColor() {
        return deviceColor;
    }

    public void setDeviceColor(String deviceColor) {
        this.deviceColor = deviceColor;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
