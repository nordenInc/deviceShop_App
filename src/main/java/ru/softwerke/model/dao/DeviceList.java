package ru.softwerke.model.dao;

import ru.softwerke.model.Device;
import ru.softwerke.tools.ReadWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Device data storage
 */

public class DeviceList {
    private static List<Device> deviceList = new ArrayList<>();

    public static List<Device> getDeviceList() {
        return deviceList;
    }

    public static void showDeviceList() {
        for (Device device: deviceList) {
            ReadWriter.printLine(device);
        }
    }

    /**
     * To search device in list by id
     *
     * @param id
     * @return
     */

    public static Device getDevice(int id) {
         return deviceList.get(id);
    }

    /**
     * To check if device exists in list
     *
     * @param id
     * @return statement
     */

    public static boolean exist(int id) {
        int value = deviceList
                .stream()
                .filter(s -> s.getDeviceId() == id)
                .collect(Collectors.toList())
                .size();
        if (value > 0) {return true;}
        else return false;
    }

    /**
     * Use for sort and search, in purpose not to change original device list
     *
     * @return device stream
     */

    public static Stream<Device> getDeviceStream() {
        return deviceList.stream();
    }

}
