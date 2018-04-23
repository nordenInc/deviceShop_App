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

public class DeviceController extends InitController{

    public DeviceController() {}

    public void create(String manufacturer, String deviceType, String deviceModel,
                       String deviceColor, String localDate, String localPrice) {
        try {
            LocalDate releaseDate = DateParser.getDate(localDate);

            BigDecimal price = PriceParser.getPrice(localPrice);

            DeviceList.getClientsList().add(new Device.Builder()
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

//    public void delete(int id) {
//        Database.deviceList.remove(id);
//        ReadWriter.printLine("Device was deleted");
//        initMenu.showInitMenu();
//    }
}
