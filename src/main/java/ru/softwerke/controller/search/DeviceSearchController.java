package ru.softwerke.controller.search;

import ru.softwerke.controller.InitController;
import ru.softwerke.model.dao.DeviceList;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.parsers.DateParser;
import ru.softwerke.tools.parsers.PriceParser;

import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDate;

public class DeviceSearchController extends InitController {

    public void searchById(String id) {
        int searchId = Integer.parseInt(id);
        DeviceList.getDeviceStream()
                .filter(s -> (s.getDeviceId() == searchId))
                .forEach(c -> ReadWriter.printLine(c));
        initMenu.showInitMenu();
    }

    public void searchByManufacturer(String manufacturer) {
        DeviceList.getDeviceStream()
                .filter(s -> s.getManufacturer().equalsIgnoreCase(manufacturer))
                .forEach(c -> ReadWriter.printLine(c));
        initMenu.showInitMenu();
    }

    public void searchByDeviceType(String deviceType) {
        DeviceList.getDeviceStream()
                .filter(s -> s.getDeviceType().equalsIgnoreCase(deviceType))
                .forEach(c -> ReadWriter.printLine(c));
        initMenu.showInitMenu();
    }

    public void searchByDeviceModel(String deviceModel) {
        DeviceList.getDeviceStream()
                .filter(s -> s.getDeviceModel().equalsIgnoreCase(deviceModel))
                .forEach(c -> ReadWriter.printLine(c));
        initMenu.showInitMenu();
    }

    public void searchByDeviceColor(String deviceColor) {
        DeviceList.getDeviceStream()
                .filter(s -> s.getDeviceColor().equalsIgnoreCase(deviceColor))
                .forEach(c -> ReadWriter.printLine(c));
        initMenu.showInitMenu();
    }

    public void searchByReleaseDate(String bDay) {
        LocalDate localDate = DateParser.getDate(bDay);
        DeviceList.getDeviceStream()
                .filter(s -> s.getReleaseDate().equals(localDate))
                .forEach(c -> ReadWriter.printLine(c));
        initMenu.showInitMenu();
    }

    public void searchByDevicePrice(String devicePrice) throws ParseException {
        BigDecimal price = PriceParser.getPrice(devicePrice);
        DeviceList.getDeviceStream()
                .filter(s -> s.getPrice().equals(price))
                .forEach(c -> ReadWriter.printLine(c));
        initMenu.showInitMenu();
    }
}
