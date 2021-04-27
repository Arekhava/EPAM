package task1second.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayParser {
    private final static Logger logger = LogManager.getLogger(ArrayParser.class);

    final String SPACE_REGEX = "\\s+";

   public int[] parseStringIntoArray(String numberString) {
        String[] lineElements = numberString.split(SPACE_REGEX);
        int[] array = new int[lineElements.length];
        for (int i = 0; i < lineElements.length; i++) {
            array[i] = Integer.parseInt(lineElements[i]);
        }
        logger.info("Method parseStringIntoArray returns " + Arrays.toString(array));
        return array;
    }
}
