package ua.hillel.karhapoltseva.lessons.lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int userValueM = 0,userValueN = 0, valueMatrix =10;

         while  (true) {
            System.out.print("Ведіть значення М:  ");
            if (sc.hasNextInt()) {
                userValueM = sc.nextInt();
                if (userValueM>0){
                    sc.nextLine();
                    break;
                } else {
                    System.out.println("Wrong data!!!");
                    sc.nextLine();
                }
            } else {
                System.out.println("Wrong data!!!");
                sc.nextLine();
            }
          }
            while (true) {
                System.out.print("Ведіть значення N:  ");
                if (sc.hasNextInt()) {
                     userValueN = sc.nextInt();
                    if (userValueN>0){
                        sc.nextLine();
                        break;
                    } else {
                        System.out.println("Wrong data!!!");
                        sc.nextLine();
                    }
                } else {
                    System.out.println("Wrong data!!!");
                    sc.nextLine();
                }
            }
        int[][] arrayMN = new int[userValueM][userValueN];
        int[][] arrayNM = new int [userValueN][userValueM];

        for (int i = 0; i < arrayMN.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayMN[i].length; j++) {
                arrayMN[i][j]= (int)( Math.random()*valueMatrix);
                arrayNM[j][i]=arrayMN[i][j];
                System.out.print(arrayMN[i][j]+"\t");
            }
        }
        System.out.println();
        for (int i = 0; i < arrayNM.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayNM[i].length; j++) {
                System.out.print(arrayNM[i][j]+"\t");
            }
        }
    }
}
/*  00   01   02  03  04
    0    1    2   3   4
 0  8    9   10  11  8   00
 1  1    2   9   7   6   10
 2  3    5   7   8   9   20
 */