package task1.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import task1.exception.CustomException;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class ArrayReader {
    static Logger logger= LogManager.getLogger();
    public List<String> read(String fileName) throws CustomException {
        List<String> strings = new LinkedList<>();
        try (Scanner file = new Scanner(new File(fileName))) {

            while (file.hasNextLine()) {
                String line = file.nextLine();
                strings.add(line);
            }

        } catch(IOException e) {
            logger.error ("line not found");
            throw new CustomException("Reader failed with IO Exception");
        }
        return strings;
    }
}
