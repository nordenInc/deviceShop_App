package ru.softwerke.controller.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.softwerke.controller.ClientController;
import ru.softwerke.model.Client;
import ru.softwerke.model.dao.ClientList;
import ru.softwerke.tools.parsers.DateParser;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ClientSortControllerTest {
    private List<Client> clientListTest = new ArrayList<>();
    private ClientController clientControllerTest = new ClientController();

    @Before
    public void setUp() {
        clientControllerTest.create("Jack", "Bim", "T", "12/12/1995");
        clientControllerTest.create("Adams", "Cell", "T", "12/12/1991");
    }

    @After
    public void tearDown() {
        clientListTest = null;
    }

    @Test
    public void testSortByNameClient() {
        clientListTest = ClientSortController.sortByName();
        assertEquals(clientListTest.get(0).getFirstName(), "Adams");
        assertEquals(clientListTest.get(1).getFirstName(), "Jack");
    }

    @Test
    public void testSortByLastNameClient() {
        clientListTest = ClientSortController.sortBySurname();
        assertEquals(clientListTest.get(0).getLastName(), "Bim");
        assertEquals(clientListTest.get(1).getFirstName(), "Cell");
    }

    @Test
    public void testSortByBirthdayClient() {
        clientListTest = ClientSortController.sortByName();
        assertEquals(clientListTest.get(0).getBirthDate(), DateParser.getDate("12/12/1991"));
        assertEquals(clientListTest.get(1).getBirthDate(), DateParser.getDate("12/12/1995"));
    }


}