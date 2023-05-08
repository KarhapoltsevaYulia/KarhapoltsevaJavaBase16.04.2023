package ua.hillel.karhapoltseva.lessons.lesson7;

import java.util.Arrays;

public class Exercise_9 {
    public static void main(String[] args) {
        int[] values = {10, 20, -2, 6, 11, -10, 125, -3, 8, 0, 3};
        System.out.println(Arrays.toString(values));
        for (int i = 0; i < values.length; i++) {
             if (values[i]>=0) {
                 continue;
             }  else {
                 values[i]=0;
             }
        }
        System.out.println(Arrays.toString(values));
    }
}
/*Задание:
Напишите сценарий, который найдет в массиве все отрицательные значения и заменить их на значения 0.
После этого выведет на экран все элементы массива.
int[] values = {10, 20, -2, 6, 11, -10, 125, -3, 8, 0, 3};*/