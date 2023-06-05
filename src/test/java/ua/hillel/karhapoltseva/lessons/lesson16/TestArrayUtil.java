package ua.hillel.karhapoltseva.lessons.lesson16;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestArrayUtil {
    static int[] array = null;
    static int[][] arrayMatrix=null;
    @BeforeAll
    static void beforeAll() {
       array = new int[]{};

//        };// 1,2,3,4,5
        arrayMatrix=new int[][]{
                {},
                {1, 2, 3, 4, 5}
        };
    }

    @Test
    void testmethod1(){
        Assertions.assertEquals(-1,ArrayUtil.methodArrayInt(array));
    }
    @Test
    void testmethod2(){
        Assertions.assertFalse(ArrayUtil.methodArrayInt(array)==-2);
    }
    @Test
    void testmethod3(){
        Assertions.assertEquals(-1,ArrayUtil.methodMatrix(new int[][]{}));
    }
    @Test
    void testmethod4(){
        Assertions.assertFalse(ArrayUtil.methodMatrix(arrayMatrix)== -2);
    }
    @Test
    void testmethod5(){
        Assertions.assertEquals(-5,ArrayUtil.methodMatrix(new int[5][4]));
    }
    @Test
    void testmethod6(){
        Assertions.assertEquals(-5,ArrayUtil.methodMatrix(arrayMatrix));
    }
    @Test
    void testmethod7(){
        Assertions.assertEquals(0,ArrayUtil.methodMatrix(new int[5][5]));
    }

    @AfterAll
    static void afterAll() {
        array=null;
        arrayMatrix = null;
    }

}
