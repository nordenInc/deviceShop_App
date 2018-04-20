package ru.softwerke.model.DAO;

import ru.softwerke.model.Sale;
import ru.softwerke.tools.ReadWriter;

import java.util.ArrayList;
import java.util.List;

public class SaleDAO {
    private static List<Sale> salesList = new ArrayList<>();

    public static List<Sale> getClientsList() {
        return salesList;
    }

    public static void showDeviceList() {
        for (Sale sale: salesList) {
            ReadWriter.printLine(sale);
        }
    }

}
