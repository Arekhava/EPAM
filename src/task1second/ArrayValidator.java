package task1second;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayValidator {
    private final static Logger logger = LogManager.getLogger(ArrayValidator.class);

    final static String IS_VALID_STRING = "^([-+])?\\d+(\\s(([-+])?\\d+))*$";

    public static boolean isArray(String line) {
        Pattern pattern = Pattern.compile(IS_VALID_STRING);
        Matcher matcher = pattern.matcher(line.trim());
        boolean isMatches = matcher.matches();
        logger.info("method isArray for line " + line + " returns " + isMatches);
        return isMatches;
    }
}
