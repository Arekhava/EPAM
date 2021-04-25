package task1.src.main.java.parser;

import task1.src.main.java.customException.CustomException;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Parser implements IParser
{
    public Integer[] parse(String line)
    {
        StringTokenizer tokenizer = new StringTokenizer(line, " \t\n\r,.;");
        List<Integer> numbers = new LinkedList<>();
        while (tokenizer.hasMoreElements())
        {
            String token = tokenizer.nextToken();
            int number;
            try
            {
                number = Integer.parseInt(token);
            }
            catch (NumberFormatException e)
            {
                throw new CustomException(e.getMessage());
            }
            numbers.add(number);
        }
        return numbers.toArray(new Integer[0]);
    }
}
