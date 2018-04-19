package ru.softwerke;

import ru.softwerke.tools.ReadWriter;
import ru.softwerke.view.InitMenu;

public class AppShop {
    public static void main(String[] args) {
        ReadWriter.printLine("Welcome to shop interface!");
        InitMenu initMenu = new InitMenu();
        initMenu.showInitMenu();
    }
}
