package ru.softwerke.view;

import ru.softwerke.tools.ReadWriter;
import ru.softwerke.view.search.SearchMenu;

public class InitMenu {

    private ClientMenu clientMenu;
    private DeviceMenu deviceMenu;
    private SearchMenu searchMenu;

    public InitMenu() {
        this.clientMenu = new ClientMenu();
        this.deviceMenu = new DeviceMenu();
        this.searchMenu = new SearchMenu();
    }

    public void showInitMenu() {
        ReadWriter.printLine("Select one item to continue: \n" +
                "1. Client info \n" +
                "2. Device info \n" +
                "3. Sales history \n" +
                "4. Search \n" +
                "Press 'enter' to exit");
        String operation = ReadWriter.readLine();
        switch (operation) {
            case "1":
                clientMenu.showClientsMenu();
                break;
            case "2":
                deviceMenu.showDeviceMenu();
                break;
            case "3":
                // Sale history menu
            case "4":
                searchMenu.showSearchMenu();
                break;
        }
    }
}
