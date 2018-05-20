package ru.softwerke.tools.parsers;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;

/**
 * Custom price parser
 */

public class PriceParser {

    /**
     *
     * @param localPrice - user input string
     * @return bigDecimalPrice - parsed to value according to format "#,##0.0#"
     * @throws ParseException
     */

    public static BigDecimal getPrice(String localPrice) throws ParseException {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        String pattern = "#,##0.0#";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
        decimalFormat.setParseBigDecimal(true);

        BigDecimal bigDecimalPrice = (BigDecimal) decimalFormat.parse(localPrice);

        return bigDecimalPrice;
    }

}
