package task1.creator;

import task1.entity.ArrayEntity;

public class ArrayCreator
{
    public ArrayEntity create(Integer[] array)
    {
        return new ArrayEntity(array);
    }
}


