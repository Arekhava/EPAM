package task1.src.main.java.validator;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Validator implements IValidator
{
    public boolean isFileValid(String filePath)
    {
        Path path = Paths.get(filePath);

        if (Files.notExists(path)) {
            return false;
        }

        //maybe no access right to this path
        if (!Files.exists(path))
        {
            return false;
        }

        if (Files.isDirectory(path))
        {
            return false;
        }

        return Files.isRegularFile(path);
    }

    public boolean isValid(String line)
    {
        //TODO:
        return true;
    }
}
