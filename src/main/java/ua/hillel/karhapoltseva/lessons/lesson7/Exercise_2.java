package ua.hillel.karhapoltseva.lessons.lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise_2 {
    public static void main(String[] args) {

        int a=3;
        int[] array = {1,2,3};
        int[] array2 = new int[array.length+a];
       // Arrays.copyOf(array2,array.length);
        for (int i = 0; i<array2.length-1;i++) {
          if (i <=  array.length) {
              array2[i] = array[i];
          } else{
          int temp = array[i];
              array2[i]=temp++;
             //  array2[i]=a+i;
           }
      }
      // Arrays.copyOf(array,array2.length);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));


     }
}
/*Дан масив [1, 2, 3].  Додайте йому до кінця елементи 4, 5, 6.*/