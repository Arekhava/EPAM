package task1;

public class Creator implements ICreator
{
    public ArrayEntity create(Integer[] array)
    {
      return new ArrayEntity(array);
    }
}
