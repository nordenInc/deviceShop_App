package ru.softwerke;

import ru.softwerke.model.Client;
import ru.softwerke.model.dao.ClientList;
import ru.softwerke.tools.ReadWriter;
import ru.softwerke.view.InitMenu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class AppShop {
    private static List<Client> clientList = ClientList.getClientsList();

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse("17/03/1991", formatter);
        LocalDate localDate1 = LocalDate.parse("12/10/1999", formatter);
        LocalDate localDate2 = LocalDate.parse("04/10/1995", formatter);


        clientList.add(new Client.Builder().setFirstName("Roman").setLastName("Perminov")
                .setMiddleName("Borisovich").setBirthDate(localDate).build());
        clientList.add(new Client.Builder().setFirstName("Gregory").setLastName("Sverch")
                .setMiddleName("Romanovich").setBirthDate(localDate1).build());
        clientList.add(new Client.Builder().setFirstName("Peter").setLastName("Lutter")
                .setMiddleName("Renatovich").setBirthDate(localDate2).build());

        ReadWriter.printLine("Welcome to shop interface!");
        InitMenu initMenu = new InitMenu();
        initMenu.showInitMenu();
    }
}
