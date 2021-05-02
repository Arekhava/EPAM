package task1second.service;

import task1second.entity.ArrayEntity;

import java.util.Arrays;

public class ArrayServiceImpl implements ArrayService
{
    @Override
    public int getMax(ArrayEntity entity)
    {
        Integer[] array = entity.getArray();
        int max = array[0].intValue();
        for (Integer number : array)
        {
            if (number.intValue() > max) {
                max = number;
            }
        }
        return max;
    }

    @Override
    public int getMin(ArrayEntity entity)
    {
        Integer[] array = entity.getArray();
        int min = array[0].intValue();
        for (Integer number : array)
        {
            if (number.intValue() < min) {
                min = number;
            }
        }
        return min;
    }

    @Override
    public int getSum(ArrayEntity entity)
    {
        Integer[] array = entity.getArray();
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i].intValue();
        }
        return sum;
    }


    @Override
    public int getMed(ArrayEntity entity) {
        Integer[] array = entity.getArray();
        int sum=0;
        int count = array.length;
        for (int i = 0; i < count; i++)
        {
            sum = sum + array[i].intValue();
        }
        int med = sum / count;
        return med;
    }


    @Override
    public int getPosCount(ArrayEntity entity) {
        int posCount=0;
        Integer[] array = entity.getArray();
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > 0) {
                posCount++;
            }
        }
        return posCount;
    }

    @Override
    public int getNegCount(ArrayEntity entity) {
        int negCount=0;
        Integer[] array = entity.getArray();
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < 0) {
                negCount++;
            }
        }
        return negCount;
    }

    @Override
    public void selectionSort(ArrayEntity entity) {
        Integer[] array = entity.getArray();
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[index]){
                    index = j;//searching for lowest index
                }
            }
            int number = array[index];
            array[index] = array[i];
            array[i] = number;
        }
    }

    @Override
    public void bubbleSort(ArrayEntity entity) {
        Integer[] array = entity.getArray();
        int temp = 0;
        int count = array.length;
        for(int i =0; i < count; i++)
        {
            for(int j = 1 ; j < (count - i) ; j++)
            {
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    @Override
    public void getSort(ArrayEntity entity)
    {
        Integer[] array = entity.getArray();
        Arrays.sort(array);
    }
}
