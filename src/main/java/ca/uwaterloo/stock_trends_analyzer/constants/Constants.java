package ca.uwaterloo.stock_trends_analyzer.constants;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Constants
{
    // General
    static {
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
    }
    public static final ObjectMapper MAPPER = new ObjectMapper();

    // File IO Semantics
    public static final String OUTPUT_FILE_PREFIX = "STOCK_HISTORY";
    public static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd");
    public static final Integer DATETIME_INDEX = 0;
    public static final Integer CLOSING_PRICE_INDEX = 6;
    public static final Integer STOCKHISTORY_COLUMNS = 7;

    // Slope detection
    public static final Integer NUM_MONTHS_REGRESS = 6;
    public static final Integer MINIMUM_DATAPOINTS_REGRESSION = 50;

    // Stock history API call
    public static final String SYMBOL_PLACEHOLDER = "__SYMBOL_PLACEHOLDER__";
    public static final String START_MONTH_PLACEHOLDER = "__START_MONTH_PLACEHOLDER__";
    public static final String START_DAY_PLACEHOLDER = "__START_DAY_PLACEHOLDER__";
    public static final String START_YEAR_PLACEHOLDER = "__START_YEAR_PLACEHOLDER__";
    public static final String END_MONTH_PLACEHOLDER = "__END_MONTH_PLACEHOLDER__";
    public static final String END_DAY_PLACEHOLDER = "__END_DAY_PLACEHOLDER__";
    public static final String END_YEAR_PLACEHOLDER = "__END_YEAR_PLACEHOLDER__";
    public static final String STOCK_PRICE_ENDPOINT =
        "http://ichart.finance.yahoo.com/table.csv?s=" +
        SYMBOL_PLACEHOLDER +
        "&a=" +
        START_MONTH_PLACEHOLDER +
        "&b=" +
        START_DAY_PLACEHOLDER +
        "&c=" +
        START_YEAR_PLACEHOLDER +
        "&d=" +
        END_MONTH_PLACEHOLDER +
        "&e=" +
        END_DAY_PLACEHOLDER +
        "&f=" +
        END_YEAR_PLACEHOLDER +
        "&g=d&ignore=.csv";

    // Financial news APi
    public static final String GUARDIAN_API_KEY = "f70ba1d2-355e-41a2-8ef9-7d74f7f88acd";
    public static final String NEWS_ENDPOINT = "https://content.guardianapis.com/search";
    public static final String DEFAULT_ENCODING = "UTF-8";
}
