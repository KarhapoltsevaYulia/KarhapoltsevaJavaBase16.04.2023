package ua.hillel.karhapoltseva.lessons.lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise_1 {
    public static void main(String[] args) {
        int[]array = {1,2,3};
        int[]array2 = new int[array.length];
        for (int i = array.length-1,j = 0; j < array2.length || i == 0 ; j++,--i) {
            array2[j]=array[i];

        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
/*Дан масив [1, 2, 3]. Зробіть із нього масив [3, 2, 1].*/