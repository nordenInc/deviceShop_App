package ru.softwerke.controller;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.softwerke.model.dao.ClientList;
import ru.softwerke.tools.parsers.DateParser;

import static org.junit.Assert.*;

public class ClientControllerTest {
    private static ClientController clientControllerTest = new ClientController();
    private static ClientList clientListTest = new ClientList();

    @BeforeClass
    public static void setUp() {
        clientControllerTest.create("Jack","Sim","T","12/12/1212");
    }

    @AfterClass
    public static void tearDown() {
        clientListTest = null;
    }

    @Test
    public void create() {
        assertEquals(clientListTest.search(1).getFirstName(),"Jack");
        assertEquals(clientListTest.search(1).getLastName(), "Sim");
        assertEquals(clientListTest.search(1).getMiddleName(), "T");
        assertEquals(clientListTest.search(1).getBirthDate(), DateParser.getDate("12/12/12"));
    }

    @Test
    public void delete() {
        clientControllerTest.delete("1");
        assertEquals(0, clientListTest.getClientsListT().size());
    }

    @Test
    public void update() {
        clientControllerTest.update(1, "Jack","Sim","S","12/12/1212");
        assertEquals(clientListTest.search(1).getMiddleName(), "S");
    }
}