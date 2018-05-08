package ru.softwerke.view.search;

import ru.softwerke.controller.search.DeviceSearchController;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.Returner;

import java.text.ParseException;

public class DeviceSearchMenu implements Returner {

    public void showDeviceSearchMenu() {
        ReadWriter.printLine("Device search menu: \n" +
                "1. Search by id \n" +
                "2. Search by manufacturer \n" +
                "3. Search by type \n" +
                "4. Search by model \n" +
                "5. Search by color \n" +
                "6. Search by release date \n" +
                "7. Search by price \n" +
                "8. Go back");

        String operation = ReadWriter.readLine();

        switch (operation) {
            case "1":
                searchById();
                break;
            case "2":
                searchByManufacturer();
                break;
            case "3":
                searchByDeviceType();
                break;
            case "4":
                searchByDeviceModel();
                break;
            case "5":
                searchByDeviceColor();
                break;
            case "6":
                searchByReleaseDate();
                break;
            case "7":
                searchByDevicePrice();
                break;
            case "8":
                returnToInitMenu();
                break;
            default:
                wrongEntry();
                break;
        }
    }

    private void searchById() {
        ReadWriter.printLine("Enter device id you want to find:");
        String id = ReadWriter.readLine();
        new DeviceSearchController().searchById(id);
    }

    private void searchByManufacturer() {
        ReadWriter.printLine("Enter device manufacturer you want to find:");
        String manufacturer = ReadWriter.readLine();
        new DeviceSearchController().searchByManufacturer(manufacturer);
    }

    private void searchByDeviceType() {
        ReadWriter.printLine("Enter device type you want to find:");
        String deviceType = ReadWriter.readLine();
        new DeviceSearchController().searchByDeviceType(deviceType);
    }

    private void searchByDeviceModel() {
        ReadWriter.printLine("Enter device model you want to find:");
        String deviceModel = ReadWriter.readLine();
        new DeviceSearchController().searchByDeviceModel(deviceModel);
    }

    private void searchByDeviceColor() {
        ReadWriter.printLine("Enter device color you want to find:");
        String deviceColor = ReadWriter.readLine();
        new DeviceSearchController().searchByDeviceColor(deviceColor);
    }

    private void searchByReleaseDate() {
        ReadWriter.printLine("Enter device release date you want to find:");
        String localDate = ReadWriter.readLine();
        new DeviceSearchController().searchByReleaseDate(localDate);
    }

    private void searchByDevicePrice() {
        ReadWriter.printLine("Enter device price you want to find (example: #,##0.0#):");
        String devicePrice = ReadWriter.readLine();
        try {
            new DeviceSearchController().searchByDevicePrice(devicePrice);
        } catch (ParseException e) {
            ReadWriter.printLine("Please enter price as in example: #,##0.0#");
            returnToInitMenu();
        }
    }

}
