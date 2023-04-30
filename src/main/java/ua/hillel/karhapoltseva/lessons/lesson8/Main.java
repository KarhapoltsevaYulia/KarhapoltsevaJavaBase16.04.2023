package ua.hillel.karhapoltseva.lessons.lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arrayComputer = new int[7];
        int[] arrayUser     = new int[7];
        Scanner sc = new Scanner(System.in);
        int min=0;
        for (int i = 0; i < arrayComputer.length; i++) {
            arrayComputer[i] = (int)(Math.random() * 10);

        }
        for (int i = 0; i < arrayUser.length; i++) {
                System.out.print("Enter value " + i + ": ");
                if (sc.hasNextInt()){
                    arrayUser[i] = sc.nextInt();

                    continue;
                } else {
                    while (sc.hasNextLine()) {
                        System.out.println("Ne value!");
                        arrayUser[i] = sc.nextInt();
                        break;
                    }
                }
        }
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