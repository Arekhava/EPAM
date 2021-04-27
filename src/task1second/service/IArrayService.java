package task1second.service;


import task1second.entity.ArrayEntity;

public interface IArrayService {

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

