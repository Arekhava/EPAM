package task1second.exception;

public class CustomException extends RuntimeException
{
    public CustomException(String errorMessage)
    {
        super(errorMessage);
    }
}