package ru.softwerke.view;

import ru.softwerke.tools.ReadWriter;
import ru.softwerke.controller.DeviceController;
import ru.softwerke.tools.Returner;


public class DeviceMenu implements Returner {

    public DeviceMenu() {}

    public void showDeviceMenu() {
        ReadWriter.printLine("Device menu: \n" +
                "1. Create new device \n" +
                "2. Delete device \n" +
                "3. Update device \n" +
                "4. Show all devices \n" +
                "5. Sort devices \n" +
                "6. Search in device list \n" +
                "7. Back to main menu");
        String operation = ReadWriter.readLine();

        switch (operation) {
            case "1":
                createDevice();
                break;
            case "2":
                deleteDevice();
                break;
            case "3":
                updateDevice();
                break;
            case "4":
                showDevices();
                break;
            case "5":
                // sort devices
                break;
            case "6":
                //
                break;
            case "7":
                returnToInitMenu();
                break;
                default:
                    wrongEntry();
                    break;
        }
    }

    private void createDevice() {
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

    private void deleteDevice() {
        ReadWriter.printLine("Enter device' id you want to delete:");
        int id = Integer.parseInt(ReadWriter.readLine());
        new DeviceController().delete(id);
    }

    private void updateDevice() {
        ReadWriter.printLine("Enter device' id you want to update:");
        int id = Integer.parseInt(ReadWriter.readLine());
        ReadWriter.printLine("Enter new device manufacturer:");
        String manufacturer = ReadWriter.readLine();
        ReadWriter.printLine("Enter new device type:");
        String deviceType = ReadWriter.readLine();
        ReadWriter.printLine("Enter new device model:");
        String deviceModel = ReadWriter.readLine();
        ReadWriter.printLine("Enter new device color:");
        String deviceColor = ReadWriter.readLine();
        ReadWriter.printLine("Enter new release date (example: dd/MM/yyyy):");
        String localDate = ReadWriter.readLine();
        ReadWriter.printLine("Enter new price (example: #,##0.0#):");
        String localPrice = ReadWriter.readLine();
        new DeviceController().update(id, manufacturer, deviceType, deviceModel, deviceColor, localDate, localPrice);
    }

    private void showDevices() {
        new DeviceController().showNotSortedDevices();
    }
}
