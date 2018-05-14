package ru.softwerke.controller.search;

import ru.softwerke.controller.InitController;
import ru.softwerke.model.dao.SaleList;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.parsers.DateParser;

import java.time.LocalDate;

public class SaleSearchController extends InitController {

    public void searchById(String id) {
        int searchId = Integer.parseInt(id);
        SaleList.getSalesStream()
                .filter(s -> (s.getClientSaleId() == searchId))
                .forEach(c -> ReadWriter.printLine(c));
        initMenu.showInitMenu();
    }

    public void searchByPurchaseDate(String purchaseDate) {
        LocalDate localDate = DateParser.getDate(purchaseDate);
        SaleList.getSalesStream()
                .filter(s -> s.getLocalDate().equals(localDate))
                .forEach(c -> ReadWriter.printLine(c));
        initMenu.showInitMenu();
    }
}
