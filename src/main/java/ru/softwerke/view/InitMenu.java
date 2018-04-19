package ru.softwerke.view;

import ru.softwerke.tools.ReadWriter;

public class InitMenu {

    private ClientMenu clientMenu;
    private DeviceMenu deviceMenu;

    public InitMenu() {
        this.clientMenu = new ClientMenu();
        this.deviceMenu = new DeviceMenu();
    }

    public void showInitMenu() {
        System.out.println("Select one item to continue: \n" +
                            "1. Client info \n" +
                            "2. Device info \n" +
                            "3. Sales history \n" +
                            "4. Search");
        String operation = ReadWriter.readLine();
        switch (operation) {
            case "1":
                clientMenu.showClientsMenu();
                break;
            case "2":
                deviceMenu.showDeviceMenu();
            case "3":
                // Sale history menu
            case "4":
                // Search menu
        }
    }

}
