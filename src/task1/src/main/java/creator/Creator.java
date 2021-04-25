package task1.src.main.java.creator;

import task1.src.main.java.ArrayEntity;

public class Creator implements ICreator
{
    public ArrayEntity create(Integer[] array)
    {
      return new ArrayEntity(array);
    }
}
