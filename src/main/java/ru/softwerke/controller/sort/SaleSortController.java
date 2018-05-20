package ru.softwerke.controller.sort;

import ru.softwerke.controller.InitController;
import ru.softwerke.model.Sale;
import ru.softwerke.model.dao.SaleList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Controller for sale sort with params:
 * (id, purchase date)
 */

public class SaleSortController extends InitController {
    public static List<Sale> sortById() {
        return SaleList.getSalesStream().sorted(Comparator.comparing(Sale::getClientSaleId))
                .collect(Collectors.toList());
    }

    public static List<Sale> sortByPurchaseDate() {
        return SaleList.getSalesStream().sorted(Comparator.comparing(Sale::getLocalDate))
                .collect(Collectors.toList());
    }
}
