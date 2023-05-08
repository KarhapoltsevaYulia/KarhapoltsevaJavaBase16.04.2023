package ua.hillel.karhapoltseva.lessons.lesson7;

import java.util.Arrays;

public class Exercise_11 {
    public static void main(String[] args) {
        int[] values = {-1, -5, -6, -3, -10, -5, 3, 4, -1, -8, 1, -10, 3,};
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
        int firstIndex =0;
        int lastIndex = values.length-1;
        while (firstIndex<=lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (values[middleIndex] > 0) {
                System.out.println("Value: "+values[middleIndex]);
                break;
            } else if (values[middleIndex] < 0) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }
    }
}
/*Задание:
 Найдите первый положительный элемент массива и выведите его на экран.
int[] values = {-1, -5, -6, -3, -10, -5, 3, 4, -1, -8, 1, -10, 3};*/