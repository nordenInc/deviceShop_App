package controller;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.softwerke.controller.ClientController;
import ru.softwerke.model.dao.ClientList;

public class ClientControllerTest {
    private ClientController clientControllerTest = new ClientController();
    private ClientList clientListTest = new ClientList();

    @Test
    public void createClientController() {
        clientControllerTest.create("Alex", "Kudrin", "Vladimirovich",
                "18/10/1995");
        Assert.assertEquals(clientListTest.search(1).getFirstName(), "Alex");
        Assert.assertEquals(clientListTest.search(1).getLastName(), "Kudrin");
        Assert.assertEquals(clientListTest.search(1).getMiddleName(), "Vladimirovich");
    }

    @Test
    public void deleteClientController() {

    }

    @Test
    public void updateClientController() {

    }

}
