package ru.softwerke.tools;

import ru.softwerke.view.InitMenu;

public interface Returner {

    default void returnToInitMenu() {
        InitMenu initMenu = new InitMenu();
        initMenu.showInitMenu();
    }

    default void wrongEntry() {
        ReadWriter.printLine("Wrong entry! Please, try again.");
        InitMenu initMenu = new InitMenu();
        initMenu.showInitMenu();
    }

    default void wrongEntryInit() {
        ReadWriter.printLine("Shutting down)");
    }
}
