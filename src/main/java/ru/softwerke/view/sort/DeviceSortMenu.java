package ru.softwerke.view.sort;

import ru.softwerke.controller.sort.DeviceSortController;
import ru.softwerke.model.Device;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.Returner;

import java.util.ArrayList;
import java.util.List;

public class DeviceSortMenu implements Returner {
    private List<Device> devices = new ArrayList<>();

    public void showDeviceSortMenu() {
        ReadWriter.printLine("Device sort menu: \n" +
                "1. Sort by manufacturer \n" +
                "2. Sort by type \n" +
                "3. Sort by model \n" +
                "4. Sort by color \n" +
                "5. Sort by release date \n" +
                "6. Sort by price \n" +
                "7. Go back");
        String operation = ReadWriter.readLine();

        switch (operation) {
            case "1":
                sortByManufacturer();
                break;
            case "2":
                sortByType();
                break;
            case "3":
                sortByModel();
                break;
            case "4":
                sortByColor();
                break;
            case "5":
                sortByReleaseDate();
                break;
            case "6":
                sortByPrice();
                break;
            case "7":
                returnToInitMenu();
            default:
                wrongEntry();
                break;
        }
    }

    private void sortByManufacturer() {
        devices.clear();
        DeviceSortController.sortByManufacturer().forEach(devices::add);
        print();
    }

    private void sortByType() {
        devices.clear();
        DeviceSortController.sortByType().forEach(devices::add);
        print();
    }

    private void sortByModel() {
        devices.clear();
        DeviceSortController.sortByModel().forEach(devices::add);
        print();
    }

    private void sortByColor() {
        devices.clear();
        DeviceSortController.sortByColor().forEach(devices::add);
        print();
    }

    private void sortByReleaseDate() {
        devices.clear();
        DeviceSortController.sortByReleaseDate().forEach(devices::add);
        print();
    }

    private void sortByPrice() {
        devices.clear();
        DeviceSortController.sortByPrice().forEach(devices::add);
        print();
    }

    private void print() {
        for (Device device: devices) {
            ReadWriter.printLine(device);
        }
        returnToInitMenu();
    }
}
