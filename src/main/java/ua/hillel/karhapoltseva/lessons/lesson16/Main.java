package ua.hillel.karhapoltseva.lessons.lesson16;

import static ua.hillel.karhapoltseva.lessons.lesson16.ArrayUtil.methodArrayInt;
import static ua.hillel.karhapoltseva.lessons.lesson16.ArrayUtil.methodMatrix;

public class Main {
    public static void main(String[] args) {
        int[]array = {};
        // {1,2,3,4,5,6,7,8,9,10}
        double average= methodArrayInt(array);
         System.out.println(average);
        int [][] arrayMatrix= {
                {1,5,2,3},
                {}
        };
      System.out.println(methodMatrix(arrayMatrix));
    }
}
