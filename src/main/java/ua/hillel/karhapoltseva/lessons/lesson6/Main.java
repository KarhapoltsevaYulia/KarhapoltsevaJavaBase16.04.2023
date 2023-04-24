package ua.hillel.karhapoltseva.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userСhance =3;
        int  userVolue =0;
        String userNotVolue;
        System.out.println("Вітаю!!!  Ви граєте у гру, вгадай, яке число загадав комп'ютр!!!");
        System.out.println("У вас є " + userСhance + " спроби, щоб відгадати це число. Поїхали  ..." );
        int userRandom= (int)(Math.random()*11);

        for (int i = 0; i < userСhance; i++) {
                System.out.println(userRandom);
            System.out.print("Введіть число від 0 до 10, яке загадав компьтер. Спроба " + (i + 1) + ": ");

               if (sc.hasNextInt()) {
                userVolue = sc.nextInt();
             } else {
                       while (sc.hasNextLine()) {
                           System.out.print("Ви ввели не число!!! Повторіть введення  ");
                           userNotVolue = sc.nextLine();
                           if (sc.hasNextInt()) {
                               userVolue = sc.nextInt();
                               sc.nextLine();
                               break;
                           }
                       }

                   }
                while (userVolue < 0 || userVolue > 10) {
                    System.out.print("Ви ввели значення, яке не входить у діапазон від 0 до 10!!! Ще раз..  ");
                    while (sc.hasNextLine()) {
                        if (sc.hasNextInt()) {
                            userVolue = sc.nextInt();
                            sc.nextLine();
                            break;
                        } else {
                            System.out.print("Ви ввели не число!!! Повторіть введення  ");
                            userNotVolue = sc.nextLine();
                        }
                    }
                }
                if (userVolue == userRandom) {
                    System.out.println("Win!!!!!!!!");
                    break;
                } else {
                    if (i != userСhance - 1)
                        System.out.println("Спробуйте ще раз!");
                }
                if (i == userСhance - 1 && userVolue != userRandom) {
                    System.out.println("Ви програли(((((");
                }
            System.out.println("Натисніть Enter");
            sc.nextLine();
        }
    }
}
