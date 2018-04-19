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

    private Device(Builder builder) {
        this.deviceId = id++;
        this.manufacturer = builder.manufacturer;
        this.deviceType = builder.deviceType;
        this.deviceModel = builder.deviceModel;
        this.deviceColor = builder.deviceColor;
        this.releaseDate = builder.releaseDate;
        this.price = builder.price;
    }

    public static class Builder {
        private int deviceId;
        private String manufacturer;
        private String deviceType;
        private String deviceModel;
        private String deviceColor;
        private LocalDate releaseDate;
        private BigDecimal price;

        public Builder(){}

        public Builder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }

        public Builder setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }

        public Builder setDeviceColor(String deviceColor) {
            this.deviceColor = deviceColor;
            return this;
        }

        public Builder setReleaseDate(LocalDate releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder setPrice(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Device build() {
            return new Device(this);
        }
    }


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
