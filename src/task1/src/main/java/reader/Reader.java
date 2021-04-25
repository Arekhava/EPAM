package task1.src.main.java.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Reader implements IReader
{
    static Logger logger=LogManager.getLogger();
    public List<String> read(String fileName)
    {
        List<String> strings = new LinkedList<>();
        try (Scanner file = new Scanner(new File(fileName))) {
            while (file.hasNextLine())
            {
                String line = file.nextLine();
                strings.add(line);
            }

        } catch(Exception e) {
            logger.error ("line not found");
        }
        return strings;
    }
}
