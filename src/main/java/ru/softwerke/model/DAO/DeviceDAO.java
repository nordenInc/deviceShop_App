package ru.softwerke.model.DAO;

import ru.softwerke.model.Device;
import ru.softwerke.tools.ReadWriter;

import java.util.ArrayList;
import java.util.List;

public class DeviceDAO {
    private static List<Device> deviceList = new ArrayList<>();

    public static List<Device> getClientsList() {
        return deviceList;
    }

    public static void showDeviceList() {
        for (Device device: deviceList) {
            ReadWriter.printLine(device);
        }
    }
}
