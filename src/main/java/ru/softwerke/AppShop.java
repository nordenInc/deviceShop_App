package ru.softwerke;

import ru.softwerke.model.Client;
import ru.softwerke.model.Device;
import ru.softwerke.model.Sale;
import ru.softwerke.model.dao.ClientList;
import ru.softwerke.model.dao.DeviceList;
import ru.softwerke.model.dao.SaleList;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.view.InitMenu;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AppShop {
    private static List<Client> clientList = ClientList.getClientsList();
    private static List<Device> deviceList = DeviceList.getDeviceList();
    private static List<Sale> sales = SaleList.getSalesList();

    public static void main(String[] args) throws ParseException {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse("17/03/1991", formatter);
        LocalDate localDate1 = LocalDate.parse("12/10/1999", formatter);
        LocalDate localDate2 = LocalDate.parse("04/10/1995", formatter);

        LocalDate localDate3 = LocalDate.parse("20/11/2017", formatter);
        LocalDate localDate4 = LocalDate.parse("12/07/2016", formatter);
        LocalDate localDate5 = LocalDate.parse("09/03/2017", formatter);

        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        String pattern = "#,##0.0#";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
        decimalFormat.setParseBigDecimal(true);

        BigDecimal bigDecimalPrice = (BigDecimal) decimalFormat.parse("1500.0");
        BigDecimal bigDecimalPrice1 = (BigDecimal) decimalFormat.parse("800.0");
        BigDecimal bigDecimalPrice2 = (BigDecimal) decimalFormat.parse("200.0");

        clientList.add(new Client.Builder().setFirstName("Roman").setLastName("Perminov")
                .setMiddleName("Borisovich").setBirthDate(localDate).build());
        clientList.add(new Client.Builder().setFirstName("Gregory").setLastName("Sverch")
                .setMiddleName("Romanovich").setBirthDate(localDate1).build());
        clientList.add(new Client.Builder().setFirstName("Peter").setLastName("Lutter")
                .setMiddleName("Renatovich").setBirthDate(localDate2).build());

        deviceList.add(new Device.Builder().setManufacturer("Apple").setDeviceType("Phone").setDeviceModel("Iphone X")
                .setDeviceColor("Black").setReleaseDate(localDate3).setPrice(bigDecimalPrice).build());
        deviceList.add(new Device.Builder().setManufacturer("Apple").setDeviceType("Phone").setDeviceModel("Iphone 7")
                .setDeviceColor("Silver").setReleaseDate(localDate4).setPrice(bigDecimalPrice1).build());
        deviceList.add(new Device.Builder().setManufacturer("Xiaomi").setDeviceType("Phone").setDeviceModel("Mi A1")
                .setDeviceColor("White").setReleaseDate(localDate5).setPrice(bigDecimalPrice2).build());

        List<Device> device = new ArrayList<>();
        List<Device> device1 = new ArrayList<>();
        List<Device> device2 = new ArrayList<>();

        device.add(deviceList.get(0));
        device.add(deviceList.get(1));
        device1.add(deviceList.get(1));
        device2.add(deviceList.get(2));

        sales.add(new Sale(clientList.get(0), device, LocalDate.now()));
        sales.add(new Sale(clientList.get(1), device1, LocalDate.now()));
        sales.add(new Sale(clientList.get(2), device2, LocalDate.now()));


        ReadWriter.printLine("Welcome to our device shop!");
        InitMenu initMenu = new InitMenu();
        initMenu.showInitMenu();
    }
}
