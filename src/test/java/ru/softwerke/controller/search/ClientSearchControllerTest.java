package ru.softwerke.controller.search;

import org.junit.After;
import org.junit.Test;
import ru.softwerke.controller.ClientController;
import ru.softwerke.model.dao.ClientList;

import static org.junit.Assert.*;

public class ClientSearchControllerTest {
    private ClientList clientListTest = new ClientList();
    private ClientSearchController clientSearchControllerTest = new ClientSearchController();
    private ClientController clientControllerTest = new ClientController();

    @After
    public void tearDown() {
        clientListTest = null;
    }

    @Test
    public void testSearchClient() {
        clientControllerTest.create("Vova", "Rotich", "R", "12/12/1212");
        clientControllerTest.create("Albert", "Munk", "W", "12/12/1212");
        clientSearchControllerTest.searchByName("Albert");
    }

}