package ru.softwerke.controller.sort;

import ru.softwerke.controller.InitController;
import ru.softwerke.model.Device;
import ru.softwerke.model.dao.DeviceList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Controller for device sort with params:
 * (manufacturer, type, model, color, release date, price)
 */

public class DeviceSortController extends InitController {

    public static List<Device> sortByManufacturer() {
        return DeviceList.getDeviceStream().sorted(Comparator.comparing(Device::getManufacturer))
                .collect(Collectors.toList());
    }

    public static List<Device> sortByModel() {
        return DeviceList.getDeviceStream().sorted(Comparator.comparing(Device::getDeviceModel))
                .collect(Collectors.toList());
    }

    public static List<Device> sortByType() {
        return DeviceList.getDeviceStream().sorted(Comparator.comparing(Device::getDeviceType))
                .collect(Collectors.toList());
    }

    public static List<Device> sortByColor() {
        return DeviceList.getDeviceStream().sorted(Comparator.comparing(Device::getDeviceColor))
                .collect(Collectors.toList());
    }

    public static List<Device> sortByReleaseDate() {
        return DeviceList.getDeviceStream().sorted(Comparator.comparing(Device::getReleaseDate))
                .collect(Collectors.toList());
    }

    public static List<Device> sortByPrice() {
        return DeviceList.getDeviceStream().sorted(Comparator.comparing(Device::getPrice))
                .collect(Collectors.toList());
    }


}
