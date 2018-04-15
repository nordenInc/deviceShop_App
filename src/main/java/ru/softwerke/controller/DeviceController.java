package ru.softwerke.controller;

import ru.softwerke.model.Database;
import ru.softwerke.model.Device;

import java.math.BigDecimal;
import java.time.LocalDate;

public class DeviceController {

    public DeviceController() {}

    public void create(String manufacturer, String deviceType, String deviceModel, String deviceColor, LocalDate releaseDate, BigDecimal price) {
        Database.deviceList.add(new Device(manufacturer, deviceType, deviceModel, deviceColor, releaseDate, price));
        System.out.println("Device was created");
    }

    public void delete(Integer id) {
        Database.deviceList.remove(id);
        System.out.println("Device was deleted");
    }
}
