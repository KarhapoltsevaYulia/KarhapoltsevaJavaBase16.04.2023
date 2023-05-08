package ua.hillel.karhapoltseva.lessons.lesson7;

public class Exercize_7 {
    public static void main(String[] args) {
        char[] array = {'a','b','c','d'};
        int element = 1;
        for (int i = 0; i < array.length ; i++) {
            if (i % 2 ==0) {
            System.out.print(array[i]+"+");
            } else {
                System.out.print(array[i]);
            }
         if  (i==element) {
             System.out.print(",");
             System.out.println();
         }
        }
    }
}
//Створіть масив arr = ['a', 'b', 'c', 'd'] і за допомогою його виведіть на екран рядок 'a+b, c+d'.