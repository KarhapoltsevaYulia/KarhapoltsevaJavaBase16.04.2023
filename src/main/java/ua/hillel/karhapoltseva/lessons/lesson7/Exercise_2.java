package ua.hillel.karhapoltseva.lessons.lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise_2 {
    public static void main(String[] args) {

        int newLength=3;
        int temp=0;
        int[] array = {1,2,3};
        int[] array2 = new int[array.length+newLength];
        for (int i = 0; i<array2.length;i++) {
          if (i <=  array.length-1) {
              array2[i] = array[i];
              temp = array2[i];
              temp++;
          } else {
              array2[i]=temp++;
           }
      }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
     }
}
/*Дан масив [1, 2, 3].  Додайте йому до кінця елементи 4, 5, 6.*/