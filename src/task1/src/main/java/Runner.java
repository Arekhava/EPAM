package task1.src.main.java;

import task1.src.main.java.creator.Creator;
import task1.src.main.java.creator.ICreator;
import task1.src.main.java.customException.CustomException;
import task1.src.main.java.parser.IParser;
import task1.src.main.java.parser.Parser;
import task1.src.main.java.reader.IReader;
import task1.src.main.java.reader.Reader;
import task1.src.main.java.service.IService;
import task1.src.main.java.validator.IValidator;
import task1.src.main.java.validator.Validator;

import java.util.List;

public class Runner
{
    private IReader reader;
    private IParser parser;
    private IService service;
    private IValidator validator;
    private ICreator creator;

    public Runner(IReader reader, IParser parser, IService service, IValidator validator, ICreator creator)
    {
        this.reader = reader;
        this.parser = parser;
        this.service = service;
        this.validator = validator;
        this.creator = creator;

    }

    public ArrayEntity getArrays(String filePath)
    {

        ArrayEntity entity = null;
        if (!validator.isFileValid(filePath))
        {
            throw new CustomException("Not valid file");


        }
        List<String> strings = reader.read(filePath);

        for (String string : strings)
        {
            if (!validator.isValid(string))
            {
                continue;
            }

            Integer[] array = null;
            try
            {
                array = parser.parse(string);
            }
            catch (CustomException e)
            {
                //log
                continue;
            }

            entity = creator.create(array);
            break;
        }

        return entity;
    }

    public static void main(String[] args)
    {
        String filePath = Runner.class.getResource("task1.txt").getPath().substring(1);
        Runner runner = new Runner(new Reader(), new Parser(), null, new Validator(), new Creator());
        ArrayEntity entity = runner.getArrays(filePath);
        System.out.println(entity);
    }
}
