package service;


import entity.ArrayEntity;

public interface ArrayService {

        int findMax(ArrayEntity entity);
        int findMin(ArrayEntity entity);
        int findSum(ArrayEntity entity);
        int findMed(ArrayEntity entity);
        int findPosCount(ArrayEntity entity);
        int findNegCount(ArrayEntity entity);
        void selectionSort(ArrayEntity entity);
        void bubbleSort(ArrayEntity entity);
        void getSort(ArrayEntity entity);
    }

