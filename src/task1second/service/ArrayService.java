package task1second.service;

import task1second.entity.ArrayEntity;

import java.util.Arrays;

public class ArrayService implements IArrayService
{
    int[] ArrayEntity;

    @Override
    public void getMax(task1second.entity.ArrayEntity entity)
    {
        int max = ArrayEntity[0];
        for (int number : ArrayEntity)
        {
            if (number > max) {
                max = number;
            }
        }
    }

    @Override
    public void getMin(ArrayEntity entity)
    {
        int min = ArrayEntity[0];
        for (int number : ArrayEntity)
        {
            if (number < min) {
                min = number;
            }
        }
    }

    @Override
    public void getSum(ArrayEntity entity)
    {
        int sum=0;
        for (int i = 0; i < ArrayEntity.length; i++)
        {
            sum++;
        }
    }


    @Override
    public void getMed(ArrayEntity entity) {
        int med=0;
        int sum=0;
        for (int i = 0; i < ArrayEntity.length; i++)
        {
            sum++;
        }
        med=sum/ArrayEntity.length;
    }


    @Override
    public void getPosCount(ArrayEntity entity) {
        int posCount=0;

        for (int i = 0; i < ArrayEntity.length; i++)
        {
            if (ArrayEntity[i] > 0) {
                posCount++;
            }
        }
    }

    @Override
    public void getNegCount(ArrayEntity entity) {
        int negCount=0;
        for (int i = 0; i < ArrayEntity.length; i++)
        {
            if (ArrayEntity[i] < 0) {
                negCount++;
            }
        }
    }

    @Override
    public void selectionSort(ArrayEntity entity) {
        int[] ArrayEntity = new int[0];
        for (int i = 0; i < ArrayEntity.length; i++);
        int i = 0;
        int min = ArrayEntity[i];
        int min_i = i;
        for (int j = i+1; j < ArrayEntity.length; j++)
        {
            if (ArrayEntity[j] < min)
            {
                min = ArrayEntity[j];
                min_i = j;
            }
        }
        if (i != min_i) {
            int tmp = ArrayEntity[i];
            ArrayEntity[i] = ArrayEntity[min_i];
            ArrayEntity[min_i] = tmp;
        }
    }

    @Override
    public void bubbleSort(ArrayEntity entity) {
        for(int i = ArrayEntity.length-1 ; i > 0 ; i--)
        {
            for(int j = 0 ; j < i ; j++)
            {

                if( ArrayEntity[j] > ArrayEntity[j+1] )
                {
                    int tmp = ArrayEntity[j];
                    ArrayEntity[j] = ArrayEntity[j+1];
                    ArrayEntity[j+1] = tmp;
                }
            }
        }
    }

    @Override
    public void getSort(ArrayEntity entity)
    {
        {
        Arrays.sort(ArrayEntity);
        }
    }
}
