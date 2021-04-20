package task1;

public class CustomException extends RuntimeException
{
    public CustomException(String errorMessage)
    {
        super(errorMessage);
    }
}
