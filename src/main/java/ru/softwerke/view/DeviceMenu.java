package ru.softwerke.view;

import ru.softwerke.tools.ReadWriter;
import ru.softwerke.controller.DeviceController;


public class DeviceMenu {

    public DeviceMenu() {}

    public void showDeviceMenu() {
        ReadWriter.printLine("Device menu: \n" +
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
        ReadWriter.printLine("Enter device price(example: #,##0.0#):");
        String localPrice = ReadWriter.readLine();

        new DeviceController().create(manufacturer, deviceType, deviceModel, deviceColor, localDate, localPrice);
    }
}
