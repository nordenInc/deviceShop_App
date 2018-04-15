package ru.softwerke.view;

import ru.softwerke.controller.Reader;

import java.text.ParseException;
import java.util.Scanner;

public class InitMenu implements Reader {

    private ClientMenu clientMenu;
    private DeviceMenu deviceMenu;

    public InitMenu() {
        this.clientMenu = new ClientMenu();
        this.deviceMenu = new DeviceMenu();
    }

    public void showInitMenu() throws ParseException {
        System.out.println("Select one item to continue: \n" +
                            "1. Client info \n" +
                            "2. Device info \n" +
                            "3. Sales history \n" +
                            "4. Search");
        String operation = readLine();
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

    @Override
    public String readLine() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }
}
