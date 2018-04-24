package ru.softwerke.tools;

import ru.softwerke.view.InitMenu;

public interface Returner {

    default void returnToInitMenu() {
        InitMenu initMenu = new InitMenu();
        initMenu.showInitMenu();
    }
}
