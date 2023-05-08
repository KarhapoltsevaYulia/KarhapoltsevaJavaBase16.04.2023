package ua.hillel.karhapoltseva.lessons.lesson7;

import java.util.Arrays;

public class Exercise_3 {
    public static void main(String[] args) {
       int[] array = {1,2,3};
       int  newLength = 3;
       int[] array2 = new int[array.length+newLength];

        int temp=1;
        for (int i = array2.length-1,j= array.length-1; i >= 0; i--) {
           if(j >=0){
               if (j== array.length-1){
                   temp=array[j];
                   temp++;
               }
            array2[i]= array[j];
            j--;
           }
        }
        for (int i = 0; i < (array2.length- array.length); i++) {
            array2[i]= temp++;
        }
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array));
    }
}
/*Дан масив [1, 2, 3].  Додайте йому на початок елементи 4, 5, 6.*/