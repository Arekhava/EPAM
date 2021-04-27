package task1second.creator;

import task1second.entity.ArrayEntity;

public class ArrayCreator
{
    public ArrayEntity create(Integer[] array)
    {
        return new ArrayEntity(array);
    }
}


