package ru.softwerke.controller.search;

import ru.softwerke.controller.InitController;
import ru.softwerke.model.dao.ClientList;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.parsers.DateParser;

import java.time.LocalDate;

/**
 * Controller for client search with different params:
 * (id, name, surname, birthday)
 */

public class ClientSearchController extends InitController {

    public void searchById(String id) {
        int searchId = Integer.parseInt(id);
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



