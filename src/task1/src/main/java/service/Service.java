package task1.src.main.java.service;


public class Service implements IService {
    int[] ArrayEntity;

    @Override
    public void getMax(task1.src.main.java.ArrayEntity entity)
    {
        int max = ArrayEntity[0];
        for (int number : ArrayEntity)
        {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }

    @Override
    public void getMin(task1.src.main.java.ArrayEntity entity)
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
        public void getSum(task1.src.main.java.ArrayEntity entity) {
        int sum=0;
        for (int i = 0; i < ArrayEntity.length; i++){
            sum = +sum;
        }
    }
}



