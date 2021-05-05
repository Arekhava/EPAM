package creator;

import entity.ArrayEntity;


public class ArrayCreator
{
    public ArrayEntity create(Integer[] array)
    {
        return new ArrayEntity(array);
    }
}


