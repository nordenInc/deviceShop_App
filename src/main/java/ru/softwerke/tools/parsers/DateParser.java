package ru.softwerke.tools.parsers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Custom date parser
 */

public class DateParser {

    /**
     *
     * @param localDate - user input string
     * @return localParsedDate - parsed to date according to format "dd/MM/yyyy"
     */

    public static LocalDate getDate(String localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localParsedDate = LocalDate.parse(localDate, formatter);
        return localParsedDate;
    }

}
