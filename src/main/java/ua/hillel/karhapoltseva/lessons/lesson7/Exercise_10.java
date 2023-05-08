package ua.hillel.karhapoltseva.lessons.lesson7;

import java.util.Arrays;

public class Exercise_10 {
    public static void main(String[] args) {
        int[] values = {10, 20, 5, 7, 11, 8, 125, 4, 8, 3, 23};
        int mas1=0,mas2=0;
        System.out.println(Arrays.toString(values));
        for (int i = 0; i <= values.length-1; i++) {
            if (values[i] % 2 == 0) {
                mas1++;
            } else {
                mas2++;
            }
        }
        int[] array = new int[mas1];
        int[] array2 = new int[mas2];
        for (int i = 0,j=0,k=0; i <= values.length-1; i++) {
            if (values[i]%2==0) {
                array[j]=values[i];
                j++;
            } else {
                array2[k]=values[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}

/*Задание:
Дано массив.Создайте на оснoвое значений этого массива два новых массива.
В один массив поместите все четные значения, а во второй все нечетные.
Выведите на экран значения, которые вошли в первый массив и во второй массив.
int[] values = {10, 20, 5, 7, 11, 8, 125, 4, 8, 3, 23};*/