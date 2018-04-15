package ru.softwerke.view;

import ru.softwerke.controller.DeviceController;
import ru.softwerke.controller.Reader;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DeviceMenu implements Reader {

    public DeviceMenu() {}

    public void showDeviceMenu() throws ParseException {
        System.out.println("Device menu: \n" +
                "1. Create new device \n" +
                "2. Update device ");

        String operation = readLine();

        switch (operation) {
            case "1":
                createDevice();
                break;
            case "2":
                // update device
        }
    }

    public void createDevice() throws ParseException {
        System.out.println("Enter manufacturer:");
        String manufacturer = readLine();
        System.out.println("Enter device type:");
        String deviceType = readLine();
        System.out.println("Enter device model:");
        String deviceModel = readLine();
        System.out.println("Enter device color:");
        String deviceColor = readLine();
        System.out.println("Enter release date(example: dd/MM/yyyy):");
        String releaseDate = readLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localReleaseDate = LocalDate.parse(releaseDate, formatter);

        System.out.println("Enter device price(example: #,##0.0#):");
        String price = readLine();

        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        String pattern = "#,##0.0#";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
        decimalFormat.setParseBigDecimal(true);
        BigDecimal bigDecimalPrice = (BigDecimal) decimalFormat.parse(price);

        new DeviceController().create(manufacturer, deviceType, deviceModel, deviceColor, localReleaseDate, bigDecimalPrice);
    }

    @Override
    public String readLine() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }
}
