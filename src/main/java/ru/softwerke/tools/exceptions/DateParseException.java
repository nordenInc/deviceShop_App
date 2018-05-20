package ru.softwerke.tools.exceptions;

import java.time.format.DateTimeParseException;

public class DateParseException extends DateTimeParseException {

    public DateParseException(String message, CharSequence parsedData, int errorIndex) {
        super(message, parsedData, errorIndex);
    }
}
