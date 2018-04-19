package ru.softwerke.view;

import ru.softwerke.tools.ReadWriter;
import ru.softwerke.controller.DeviceController;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DeviceMenu {

    public DeviceMenu() {}

    public void showDeviceMenu() {
        System.out.println("Device menu: \n" +
                "1. Create new device \n" +
                "2. Update device ");

        String operation = ReadWriter.readLine();

        switch (operation) {
            case "1":
                createDevice();
                break;
            case "2":
                // update device
            case "3":
                // show all devices
        }
    }

    public void createDevice() {
        ReadWriter.printLine("Enter manufacturer:");
        String manufacturer = ReadWriter.readLine();
        ReadWriter.printLine("Enter device type:");
        String deviceType = ReadWriter.readLine();
        ReadWriter.printLine("Enter device model:");
        String deviceModel = ReadWriter.readLine();
        ReadWriter.printLine("Enter device color:");
        String deviceColor = ReadWriter.readLine();
        ReadWriter.printLine("Enter release date(example: dd/MM/yyyy):");
        String localDate = ReadWriter.readLine();

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate localReleaseDate = LocalDate.parse(releaseDate, formatter);

        ReadWriter.printLine("Enter device price(example: #,##0.0#):");
        String localPrice = ReadWriter.readLine();

//        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
//        symbols.setGroupingSeparator(',');
//        symbols.setDecimalSeparator('.');
//        String pattern = "#,##0.0#";
//        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
//        decimalFormat.setParseBigDecimal(true);
//
//        BigDecimal bigDecimalPrice = null;
//        try {
//            bigDecimalPrice = (BigDecimal) decimalFormat.parse(price);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

        new DeviceController().create(manufacturer, deviceType, deviceModel, deviceColor, localDate, localPrice);
    }
}
