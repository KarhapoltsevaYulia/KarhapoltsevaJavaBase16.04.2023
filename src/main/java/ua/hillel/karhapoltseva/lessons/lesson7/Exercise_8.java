package ua.hillel.karhapoltseva.lessons.lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value=0;
         while(true) {
             System.out.print("Enter value: ");
             if (sc.hasNextInt()) {
                 value = sc.nextInt();
                 if (value > 0) {
                     sc.nextLine();
                     break;
                 } else {
                     System.out.println("Wrong data!!!");
                 }
             } else System.out.println("Wrong data!!!");   sc.nextLine();
         }
        System.out.println("value "+value);
         int[] array = new int [value];
        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }
        System.out.println(Arrays.toString(array));

    }
}
/*Запитайте у користувача кількість елементів масиву.
 Виходячи з даних, які ввів користувач створіть масив на ту кількість елементів,
  яку передав користувач. у кожному індексі масиву зберігайте чило яке показуватиме
  номер елемента масиву.*/