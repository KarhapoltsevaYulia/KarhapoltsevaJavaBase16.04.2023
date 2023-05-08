package ua.hillel.karhapoltseva.lessons.lesson7;

import java.util.Arrays;

public class Exercize_5 {
    public static void main(String[] args) {
        int[] array ={3,4,1,2,7};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<array[i]){
                   int temp2= array[j];
                   array[j]= array[i];
                   array[i]=temp2;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
//Дан масив [3, 4, 1, 2, 7]. Відсортуйте його.