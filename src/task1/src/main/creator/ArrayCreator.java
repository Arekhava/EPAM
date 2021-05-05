package src.main.creator;

import src.main.entity.ArrayEntity;


public class ArrayCreator
{
    public ArrayEntity create(Integer[] array)
    {
        return new ArrayEntity(array);
    }
}


