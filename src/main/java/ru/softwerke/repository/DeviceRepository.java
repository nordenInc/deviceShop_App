package ru.softwerke.repository;

import ru.softwerke.tables.Device;

import java.math.BigDecimal;

public interface DeviceRepository {
    Device create(String manufacturer, String deviceType, String model, String color, BigDecimal devicePrice);

}
