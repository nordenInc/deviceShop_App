package ru.softwerke.view;

import ru.softwerke.tools.ReadWriter;
import ru.softwerke.controller.ClientController;
import ru.softwerke.tools.Returner;
import ru.softwerke.view.sort.ClientSortMenu;

public class ClientMenu implements Returner {
    private ClientSortMenu clientSortMenu;

    public ClientMenu() {
        this.clientSortMenu = new ClientSortMenu();
    }

    public void showClientsMenu() {
        ReadWriter.printLine("Clients menu: \n" +
                "1. Create new client \n" +
                "2. Delete client \n" +
                "3. Update client \n" +
                "4. Sort clients \n" +
                "5. Show all clients \n" +
                "6. Back to main menu");
        String operation = ReadWriter.readLine();

        switch (operation) {
            case "1":
                createClient();
                break;
            case "2":
                deleteClient();
                break;
            case "3":
                updateClient();
                break;
            case "4":
                clientSortMenu.showClientsSortMenu();
                break;
            case "5":
                showClients();
                break;
            case "6":
                returnToInitMenu();
                break;
        }
    }

    private void createClient() {
        ReadWriter.printLine("Enter name:");
        String firstName = ReadWriter.readLine();
        ReadWriter.printLine("Enter surname:");
        String lastName = ReadWriter.readLine();
        ReadWriter.printLine("Enter middle name:");
        String middleName = ReadWriter.readLine();
        ReadWriter.printLine("Enter birth date (example: dd/MM/yyyy)");
        String localDate = ReadWriter.readLine();
        new ClientController().create(firstName, lastName, middleName, localDate);
    }

    private void deleteClient() {
        ReadWriter.printLine("Enter client id:");
        int id = Integer.parseInt(ReadWriter.readLine());
        new ClientController().delete(id);
    }

    private void updateClient() {
        ReadWriter.printLine("Enter client's id that you want to update:");
        int id = Integer.parseInt(ReadWriter.readLine());
        ReadWriter.printLine("Enter new client's name:");
        String firstName = ReadWriter.readLine();
        ReadWriter.printLine("Enter new client's surname:");
        String lastName = ReadWriter.readLine();
        ReadWriter.printLine("Enter new client's middle name:");
        String middleName = ReadWriter.readLine();
        ReadWriter.printLine("Enter new birth date (example: dd/MM/yyyy)");
        String localDate = ReadWriter.readLine();
        new ClientController().update(id, firstName, lastName, middleName, localDate);
    }

    private void showClients() {
        new ClientController().showNotSortedClients();
    }

}
