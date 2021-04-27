package task1.src.main.java.service;

import task1.src.main.java.ArrayEntity;

public interface IService
{
    void getMax(ArrayEntity entity);
    void getMin(ArrayEntity entity);
    void getSum(ArrayEntity entity);
    void getMed(ArrayEntity entity);
    void getPosCount(ArrayEntity entity);
    void getNegCount(ArrayEntity entity);
    void selectionSort(ArrayEntity entity);
    void bubbleSort(ArrayEntity entity);
    void getSort(ArrayEntity entity);
}
