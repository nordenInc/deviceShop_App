package ru.softwerke;

import ru.softwerke.view.InitMenu;

import java.text.ParseException;

public class AppShop {
    public static void main(String[] args) throws ParseException {
        InitMenu initMenu = new InitMenu();
        initMenu.showInitMenu();
    }
}
