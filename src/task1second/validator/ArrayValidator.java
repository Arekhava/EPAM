package task1second.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ArrayValidator {
    private final static Logger logger = LogManager.getLogger(ArrayValidator.class);

    private ArrayValidator() {}

    final static String REGEXP_VALID_STRING = "^([-+])?\\d+(\\s(([-+])?\\d+))*$";

    public static boolean isValid(String line) {
        Pattern pattern = Pattern.compile(REGEXP_VALID_STRING);
        Matcher matcher = pattern.matcher(line.trim());
        boolean isMatches = matcher.matches();
        logger.info("method isValid for line " + line + " returns " + isMatches);
        return isMatches;
    }
}
