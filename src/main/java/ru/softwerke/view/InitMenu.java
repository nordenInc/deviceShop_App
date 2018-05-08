package ru.softwerke.view;

import ru.softwerke.tools.ReadWriter;
import ru.softwerke.tools.Returner;


public class InitMenu implements Returner {

    private ClientMenu clientMenu;
    private DeviceMenu deviceMenu;

    public InitMenu() {
        this.clientMenu = new ClientMenu();
        this.deviceMenu = new DeviceMenu();
    }

    public void showInitMenu() {
        ReadWriter.printLine("Select one item to continue: \n" +
                "1. Client info \n" +
                "2. Device info \n" +
                "3. Sales \n" +
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
                // Sale  menu
                break;
                default:
                    wrongEntry();
                    break;
        }
    }
}
