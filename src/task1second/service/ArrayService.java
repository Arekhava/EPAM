package task1second.service;


import task1second.entity.ArrayEntity;

public interface ArrayService {

        int getMax(ArrayEntity entity);
        int getMin(ArrayEntity entity);
        int getSum(ArrayEntity entity);
        int getMed(ArrayEntity entity);
        int getPosCount(ArrayEntity entity);
        int getNegCount(ArrayEntity entity);
        void selectionSort(ArrayEntity entity);
        void bubbleSort(ArrayEntity entity);
        void getSort(ArrayEntity entity);
    }

