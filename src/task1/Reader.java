package task1;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Reader implements IReader
{
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
            // Logging, etc
        }
        return strings;
    }
}
