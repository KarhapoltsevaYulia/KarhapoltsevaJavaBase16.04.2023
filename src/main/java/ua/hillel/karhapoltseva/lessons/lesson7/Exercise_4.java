package ua.hillel.karhapoltseva.lessons.lesson7;

import java.util.Arrays;

public class Exercise_4 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int newLenght= 1,index = 2, element =10;
        int[] array2 = new int [array.length+newLenght];
        for (int i = 0,j=0; i < array2.length; i++) {
           if (j< array.length)
            array2[i]=array[j];
            if (i== index){
                array2[i]= element;
                continue;
            }
            j++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
/*Дан масив [1, 2, 3, 4, 5]. Перетворіть масив на [1, 2, 10, 3, 4, 5].*/
