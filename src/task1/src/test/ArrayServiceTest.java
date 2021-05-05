package src.test;

import src.main.entity.ArrayEntity;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.main.service.ArrayService;
import src.main.service.ArrayServiceImpl;

import static org.testng.Assert.*;


public class ArrayServiceTest {


        ArrayEntity entity;
        ArrayService arrayService;

        @BeforeClass
        public void setEntity() {
            entity = new ArrayEntity(new Integer[]{4,-10,8,12});
            arrayService = (ArrayService) new ArrayServiceImpl();
        }

        @Test
        public void testFindMax() {
            int actual = arrayService.findMax(entity);
            int expected = 12;
            assertEquals(actual, expected, 0, "Test failed as...");
        }

        @Test
        public void testFindMin() {
            int actual = arrayService.findMin(entity);
            int expected = -10;
            assertEquals(actual, expected, 0, "Test failed as...");

        }

        @Test
        public void testFindSum() {
            int actual = arrayService.findSum(entity);
            int expected = 14;
            assertEquals(actual, expected, 0, "Test failed as...");

        }

        @Test
        public void testFindMed() {
            int actual = arrayService.findMed(entity);
            int expected = 3;
            assertEquals(actual, expected, 0, "Test failed as...");


        }

        @Test
        public void testFindPosCount() {
            int actual = arrayService.findPosCount(entity);
            int expected = 3;
            assertEquals(actual, expected, 0, "Test failed as...");
        }

        @Test
        public void testFindNegCount() {
            int actual = arrayService.findNegCount(entity);
            int expected = 1;
            assertEquals(actual, expected, 0, "Test failed as...");
        }

        @Test
        public void testSelectionSort() {
            ArrayEntity actual = new ArrayEntity(new  Integer[]{4,-10,8,12});
            ArrayEntity expected = new ArrayEntity(new  Integer[]{-10,4,8,12});
            arrayService.selectionSort(actual);
            assertEquals(actual, expected, "Test failed as...");
        }

        @Test
        public void testBubbleSort() {
            ArrayEntity actual = new ArrayEntity(new  Integer[]{4,-10,8,12});
            ArrayEntity expected = new ArrayEntity(new  Integer[]{-10,4,8,12});
            arrayService.bubbleSort(actual);

            arrayService.bubbleSort(actual);
            assertEquals(actual, expected, "Test failed as...");


        }

        @Test
        public void testGetSort() {
            ArrayEntity actual = new ArrayEntity(new  Integer[]{4,-10,8,12});
            ArrayEntity expected = new ArrayEntity(new  Integer[]{-10,4,8,12});
            arrayService.getSort(actual);
            assertEquals(actual, expected, "Test failed as...");
        }
    }
