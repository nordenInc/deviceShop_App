package ru.softwerke.controller.search;

import ru.softwerke.controller.InitController;
import ru.softwerke.model.Client;
import ru.softwerke.model.dao.ClientList;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.parsers.DateParser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientSearchController extends InitController {

    public void searchById(String id) {
        long searchId = Long.parseLong(id);
        ClientList.getClientStream()
                .filter(s -> (s.getClientId() == searchId))
                .forEach(c -> ReadWriter.printLine(c));
        initMenu.showInitMenu();
    }

    public void searchByName(String firstName) {
        ClientList.getClientStream()
                .filter(s -> s.getFirstName().equalsIgnoreCase(firstName))
                .forEach(c -> ReadWriter.printLine(c));
        initMenu.showInitMenu();
    }

    public void searchBySurname(String lastName) {
        ClientList.getClientStream()
                .filter(s -> s.getLastName().equalsIgnoreCase(lastName))
                .forEach(c -> ReadWriter.printLine(c));
        initMenu.showInitMenu();
    }

    public void searchByBDay(String bDay) {
        LocalDate localDate = DateParser.getDate(bDay);
        ClientList.getClientStream()
                .filter(s -> s.getBirthDate().equals(localDate))
                .forEach(c -> ReadWriter.printLine(c));
        initMenu.showInitMenu();
    }
}



