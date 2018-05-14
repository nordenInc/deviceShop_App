package ru.softwerke.model.dao;

import ru.softwerke.model.Sale;
import ru.softwerke.tools.ReadWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SaleList {
    private static List<Sale> salesList = new ArrayList<>();

    public static List<Sale> getSalesList() {
        return salesList;
    }

    public static void showSaleList() {
        for (Sale sale: salesList) {
            ReadWriter.printLine(sale);
        }
    }

    public static Stream<Sale> getSalesStream() {
        return salesList.stream();
    }

    public void addSale(Sale sale) {
        salesList.add(sale);
    }

}
