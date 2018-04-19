package ru.softwerke.tools.parsers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParser {

    public static LocalDate getDate(String localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localParsedDate = LocalDate.parse(localDate, formatter);
        return localParsedDate;
    }

}
