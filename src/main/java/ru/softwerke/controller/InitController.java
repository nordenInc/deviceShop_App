package ru.softwerke.controller;

import ru.softwerke.view.InitMenu;

public class InitController {
    protected InitMenu initMenu = new InitMenu();

    public void backToMainMenu() {
        initMenu.showInitMenu();
    }


}
