package ru.softwerke.tables;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "device")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "device_id_generator")
    @SequenceGenerator(name = "device_id_generator",
            sequenceName = "device_id")
    private int deviceId;

    @Column(name = "manufacturer", nullable = false)
    private String manufacturer;

    @Column(name = "device_type", nullable = false)
    private String deviceType;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "device_price")
    private BigDecimal devicePrice;

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getDevicePrice() {
        return devicePrice;
    }

    public void setDevicePrice(BigDecimal devicePrice) {
        this.devicePrice = devicePrice;
    }
}
