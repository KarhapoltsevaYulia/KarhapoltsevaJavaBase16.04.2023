package ua.hillel.karhapoltseva.lessons.lesson7;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int minAge = 18, maxAge = 40;
        double sumTeam1 = 0,sumTeam2 = 0, averageTeam1=0,averageTeam2=0;
     if (team1.length==team2.length) {
         for (int i = 0; i < team1.length; i++) {
             team1[i] = (int) (Math.random() * (maxAge - minAge + 1) + minAge);
             sumTeam1 += team1[i];
             System.out.print(team1[i] + " ");
             team2[i] = (int) (Math.random() * (maxAge - minAge + 1) + minAge);
             sumTeam2 += team2[i];

             if (i == team1.length - 1) {
                 System.out.println();
                     for (int value : team2) {
                     System.out.print(value + " ");
                     }
                 averageTeam1 = sumTeam1 / team1.length;
                 averageTeam2 = sumTeam2 / team2.length;
                 System.out.println();
                 System.out.println(" Середній вік гравців першої команди : " + averageTeam1);
                 System.out.println(" Середній вік гравців другої команди : " + averageTeam2);
                 }
            }
    } else {
         for (int i = 0; i < team1.length; i++) {
             team1[i] = (int) (Math.random() * (maxAge - minAge + 1) + minAge);
             sumTeam1 += team1[i];
             System.out.print(team1[i] + " ");
         }
         System.out.println();
         for (int i = 0; i < team2.length; i++) {
             team2[i] = (int) (Math.random() * (maxAge - minAge + 1) + minAge);
             sumTeam2 += team2[i];
             System.out.print(team2[i] + " ");
         }
         averageTeam1 = sumTeam1 / team1.length;
         averageTeam2 = sumTeam2 / team2.length;
         System.out.println();
         System.out.println(" Середній вік гравців першої команди : " + averageTeam1);
         System.out.println(" Середній вік гравців другої команди : " + averageTeam2);

}
    }
}
/*Є дві команди регбі з 25 гравців різного віку у кожній.
Вік беремо випадковим чином в діапазоні від 18 до 40.
Виведіть у двох рядках вік гравців кожної команди.
Порахуйте середній вік гравців кожної команди та виведіть на екран.*/