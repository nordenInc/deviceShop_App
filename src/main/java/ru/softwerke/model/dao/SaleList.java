package ru.softwerke.model.dao;

import ru.softwerke.model.Sale;
import ru.softwerke.tools.ReadWriter;

import java.util.ArrayList;
import java.util.List;

public class SaleList {
    private static List<Sale> salesList = new ArrayList<>();

    public static List<Sale> getClientsList() {
        return salesList;
    }

    public static void showSaleList() {
        for (Sale sale: salesList) {
            ReadWriter.printLine(sale);
        }
    }

    public void addSale(Sale sale) {
        salesList.add(sale);
    }

}
