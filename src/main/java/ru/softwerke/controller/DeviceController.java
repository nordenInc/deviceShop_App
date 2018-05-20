package ru.softwerke.controller;

import ru.softwerke.model.dao.DeviceList;
import ru.softwerke.model.Device;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.parsers.DateParser;
import ru.softwerke.tools.parsers.PriceParser;

import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 * Controller for create, delete, update and show devices
 */

public class DeviceController extends InitController{

    public DeviceController() {}

    /**
     * Add new device to list
     *
     * @param manufacturer
     * @param deviceType
     * @param deviceModel
     * @param deviceColor
     * @param localDate
     * @param localPrice
     */

    public void create(String manufacturer, String deviceType, String deviceModel,
                       String deviceColor, String localDate, String localPrice) {
        try {
            LocalDate releaseDate = DateParser.getDate(localDate);

            BigDecimal price = PriceParser.getPrice(localPrice);

            DeviceList.getDeviceList().add(new Device.Builder()
                    .setManufacturer(manufacturer)
                    .setDeviceModel(deviceModel)
                    .setDeviceType(deviceType)
                    .setDeviceColor(deviceColor)
                    .setReleaseDate(releaseDate)
                    .setPrice(price)
                    .build());
            ReadWriter.printLine("Device was created");
            initMenu.showInitMenu();
        } catch (DateTimeParseException e) {
            ReadWriter.printLine("Wrong entry, new client was not created. \n" +
                    "Please, write the date as 'dd/MM/yyyy'. \n");
            initMenu.showInitMenu();
        } catch (ParseException e) {
            ReadWriter.printLine("Wrong entry, new client was not created. \n" +
                    "Please, write the price as '#,##0.0#'. \n");
            initMenu.showInitMenu();
        }
    }

    /**
     * Delete device from list
     *
     * @param id
     */

    public void delete(int id) {
        DeviceList.getDeviceList().remove(id);
        ReadWriter.printLine("Device was deleted");
        initMenu.showInitMenu();
    }

    /**
     * Update exist device
     *
     * @param id
     * @param manufacturer
     * @param deviceType
     * @param deviceModel
     * @param deviceColor
     * @param localDate
     * @param localPrice
     */

    public void update(int id, String manufacturer, String deviceType, String deviceModel, String deviceColor,
                       String localDate, String localPrice) {
        Device device = DeviceList.getDeviceList().get(id);

        if (DeviceList.exist(id)) {
            try {
                LocalDate releaseDate = DateParser.getDate(localDate);
                BigDecimal price = PriceParser.getPrice(localPrice);
                device.setManufacturer(manufacturer);
                device.setDeviceType(deviceType);
                device.setDeviceModel(deviceModel);
                device.setDeviceColor(deviceColor);
                device.setReleaseDate(releaseDate);
                device.setPrice(price);
                ReadWriter.printLine("Device was updated");
                initMenu.showInitMenu();
            } catch (DateTimeParseException e) {
                ReadWriter.printLine("Wrong entry, new device was not created. \n" +
                        "Please, write the date as 'dd/MM/yyyy'. \n");
                initMenu.showInitMenu();
            } catch (ParseException e) {
                ReadWriter.printLine("Wrong entry, new client was not created. \n" +
                        "Please, write the price as '#,##0.0#'. \n");
                initMenu.showInitMenu();
            }
        } else {
            ReadWriter.printLine("Wrong device id!");
            initMenu.showInitMenu();
        }
    }

    /**
     * Show original device list
     */

    public void showNotSortedDevices() {
        DeviceList.showDeviceList();
        initMenu.showInitMenu();
    }
}
