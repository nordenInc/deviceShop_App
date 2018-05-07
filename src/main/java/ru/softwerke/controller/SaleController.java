package ru.softwerke.controller;

import ru.softwerke.model.Device;
import ru.softwerke.model.dao.DeviceList;
import ru.softwerke.tools.ReadWriter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SaleController extends InitController {

    public void create(int clientId, Map<Integer, Integer> devicePool, LocalDate localDate) {
        List<Device> deviceList = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : devicePool.entrySet()){
            int deviceId = entry.getKey();
            int numberOfDevice = entry.getValue();
            if(DeviceList.exist(deviceId)){
                Device device = DeviceList.getDevice(deviceId);
                deviceList.add(device);
            } else {
                ReadWriter.printLine("Device with " + deviceId + " number doesn't exist");
                initMenu.showInitMenu();
            }
        }
    }

}
