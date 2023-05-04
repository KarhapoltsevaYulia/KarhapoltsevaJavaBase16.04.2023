package ua.hillel.karhapoltseva.lessons.lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayComputer = new int[7];
        int[] arrayUser     = new int[7];
        Scanner sc = new Scanner(System.in);
        int min=10;
        int coincidences =0;

         for (int i = 0; i < arrayComputer.length; i++) {
             arrayComputer[i] = (int) (Math.random() * min);
           }
          for (int i = 0; i < arrayUser.length; i++) {
             arrayUser[i] = (int) (Math.random() * min);
          }
         System.out.println("Невідсортовані масиви !");
         System.out.println(Arrays.toString(arrayComputer));
         System.out.println(Arrays.toString(arrayUser));
         System.out.println();

         for (int i = 1; i < arrayComputer.length; i++) {
             int k=i-1;
             int temp = arrayComputer[i];
             while (k>=0 && temp<arrayComputer[k] ) {
                 temp = arrayComputer[k + 1];
                 arrayComputer[k + 1] = arrayComputer[k];
                 arrayComputer[k] = temp;
                 k--;
             }
         }
             Arrays.sort(arrayUser);

         for (int i = 0; i < arrayComputer.length; i++) {
             if (arrayComputer[i]==arrayUser[i]){
                  coincidences++;
                 System.out.println("Збіг на "+i+" позиції");
             }

         }
         System.out.println("Кількість збігів :"+coincidences);
        System.out.println("Відсортовані масиви !");
        System.out.println(Arrays.toString(arrayComputer));
        System.out.println(Arrays.toString(arrayUser));
    }

}


/*Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
Перший масив - це числа, які загадані фірмою-організатором лотереї.
Другий масив - це числа, які вгадав гравець.
Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом; Наприклад:
first[3] повинен дорівнювати second[3], як показано нижче.
Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
[0, 1, 4, 5, 5, 8, 9]
[1, 1, 2, 3, 5, 6, 9]
Кількість збігів: 3*/