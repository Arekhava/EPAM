package task1second.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import task1second.entity.ArrayEntity;
import task1second.service.ArrayService;
import task1second.service.ArrayServiceImpl;



public class ArrayServiceTest {
    ArrayEntity entity;
    ArrayService arrayService;

@BeforeClass
public void setEntity(){
    entity=new ArrayEntity(new Integer[]{4,-10,8,12});
    arrayService=new ArrayServiceImpl();
}
    @Test
    public void testFindMax() {
    int actual=arrayService.findMax(entity);
    int expected=12;
    Assert.assertEquals(actual, expected, 0);
   }

    @Test
    public void testFindMin() {
        int actual =arrayService.findMin(entity);
        int expected =-10;
        Assert.assertEquals(actual, expected,0);

    }

    @Test
    public void testFindSum() {
        int actual=arrayService.findSum(entity);
        int expected=14;
        Assert.assertEquals(actual, expected,0);

    }

    @Test
    public void testFindMed() {
        int actual=arrayService.findMed(entity);
        int expected=3;
        Assert.assertEquals(actual, expected,0);


    }

    @Test
    public void testFindPosCount() {
        int actual=arrayService.findPosCount(entity);
        int expected=3;
        Assert.assertEquals(actual, expected,0);
    }

    @Test
    public void testFindNegCount() {
        int actual=arrayService.findNegCount(entity);
        int expected=1;
        Assert.assertEquals(actual, expected,0);
    }

    @Test
    public void testSelectionSort() {
        ArrayEntity actual=new ArrayEntity(new Integer[]{4,-10,8,12});
        ArrayEntity expected=new ArrayEntity(new Integer[]{-10, 4, 8, 12});
        arrayService.selectionSort(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testBubbleSort() {
        ArrayEntity actual=new ArrayEntity(new Integer[]{4,-10,8,12});
        ArrayEntity expected=new ArrayEntity(new Integer[]{-10, 4, 8, 12});
        arrayService.bubbleSort(actual);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testGetSort() {
        ArrayEntity actual=new ArrayEntity(new Integer[]{4,-10,8,12});
        ArrayEntity expected=new ArrayEntity(new Integer[]{-10, 4, 8, 12});
        arrayService.getSort(actual);
        Assert.assertEquals(actual, expected);
    }
}