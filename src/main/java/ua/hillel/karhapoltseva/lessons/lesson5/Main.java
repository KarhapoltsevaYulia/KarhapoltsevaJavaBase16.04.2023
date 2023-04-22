package ua.hillel.karhapoltseva.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teamOneFrags1=0;
        int teamOneFrags2=0;
        int teamOneFrags3=0;
        int teamOneFrags4=0;
        int teamOneFrags5=0;
        int teamTwoFrags1=0;
        int teamTwoFrags2=0;
        int teamTwoFrags3=0;
        int teamTwoFrags4=0;
        int teamTwoFrags5=0;
        double averageTeam1 = 0;
        double averageTeam2 = 0;
        double kol = 5;

        System.out.print("Введіть назву першої команди: " );
          String  teamName1 = sc.nextLine();
        System.out.print("Введіть  фраг 1-го гравця: " );
            if (sc.hasNextInt()){
                teamOneFrags1 = sc.nextInt();
                if (teamOneFrags1<0){
                    System.out.println("You entered a negative value. try again");
                    System.exit(0);
                }
            } else {
            System.out.println("Еrror!!!! Tru again");
            System.exit(0);
        }
        System.out.print("Введіть  фраг 2-го гравця: " );
        if (sc.hasNextInt()) {
            teamOneFrags2 = sc.nextInt();
            if (teamOneFrags2<0){
                System.out.println("You entered a negative value. try again");
                System.exit(0);
            }
        } else {
            System.out.println("Еrror!!!! Tru again");
            System.exit(0);
        }
        System.out.print("Введіть  фраг 3-го гравця: " );
        if (sc.hasNextInt()) {
            teamOneFrags3 = sc.nextInt();
            if (teamOneFrags3<0){
                System.out.println("You entered a negative value. try again");
                System.exit(0);
            }
        } else {
            System.out.println("Еrror!!!! Tru again");
            System.exit(0);
        }
        System.out.print("Введіть  фраг 4-го гравця: " );
        if (sc.hasNextInt()) {
            teamOneFrags4 = sc.nextInt();
            if (teamOneFrags4<0){
                System.out.println("You entered a negative value. try again");
                System.exit(0);
            }
        } else {
            System.out.println("Еrror!!!! Tru again");
            System.exit(0);
        }
        System.out.print("Введіть  фраг 5-го гравця: " );
        if (sc.hasNextInt()) {
            teamOneFrags5 = sc.nextInt();
            if (teamOneFrags5<0){
                System.out.println("You entered a negative value. try again");
                System.exit(0);
            }
        } else {
            System.out.println("Еrror!!!! Tru again");
            System.exit(0);
        }
        sc.nextLine();
        System.out.print("Введіть назву другої команди: " );
        String teamName2 = sc.nextLine();
        System.out.print("Введіть  фраг 1-го гравця: " );
        if (sc.hasNextInt()) {
            teamTwoFrags1 = sc.nextInt();
            if (teamTwoFrags1<0){
                System.out.println("You entered a negative value. try again");
                System.exit(0);
            }
        } else {
            System.out.println("Еrror!!!! Tru again");
            System.exit(0);
        }
        System.out.print("Введіть  фраг 2-го гравця: " );
        if (sc.hasNextInt()) {
            teamTwoFrags2 = sc.nextInt();
            if (teamTwoFrags2<0) {
                System.out.println("You entered a negative value. try again");
                System.exit(0);
            }
        } else {
            System.out.println("Еrror!!!! Tru again");
            System.exit(0);
        }
        System.out.print("Введіть  фраг 3-го гравця: " );
        if (sc.hasNextInt()) {
            teamTwoFrags3 = sc.nextInt();
            if (teamTwoFrags3<0) {
                System.out.println("You entered a negative value. try again");
                System.exit(0);
            }
        } else {
            System.out.println("Еrror!!!! Tru again");
            System.exit(0);
        }
        System.out.print("Введіть  фраг 4-го гравця: " );
        if (sc.hasNextInt()) {
            teamTwoFrags4 = sc.nextInt();
            if (teamTwoFrags4<0) {
                System.out.println("You entered a negative value. try again");
                System.exit(0);
            }
        } else {
            System.out.println("Еrror!!!! Tru again");
            System.exit(0);
        }
        System.out.print("Введіть  фраг 5-го гравця: " );
        if (sc.hasNextInt()) {
            teamTwoFrags5 = sc.nextInt();
            if (teamTwoFrags5<0) {
                System.out.println("You entered a negative value. try again");
                System.exit(0);
            }
        } else {
            System.out.println("Еrror!!!! Tru again");
            System.exit(0);
        }
        sc.nextLine();
        averageTeam1 = (teamOneFrags1+teamOneFrags2+teamOneFrags3+teamOneFrags4+teamOneFrags5)/kol;
        averageTeam2 = (teamTwoFrags1+teamTwoFrags2+teamTwoFrags3+teamTwoFrags4+teamTwoFrags5)/kol;
        sc.nextLine();
        if (averageTeam1>averageTeam2){
            System.out.println("Перемогла команда "+ teamName1 +" з кількістю фрагів " + averageTeam1+"  !!!!!!!");
            System.out.println("Програла команда "+ teamName2 + " з кількістю фрагів "+ averageTeam2);
        } else if (averageTeam2>averageTeam1){
            System.out.println("Перемогла команда " + teamName2 +" з кількістю фрагів "+ averageTeam2+"  !!!!!!");
            System.out.println("Програла команда "+ teamName1 + " з кількістю фрагів " + averageTeam1);
        } else {
            System.out.println(" У Команд нічия !!!");
            System.out.println(" У Команди "+teamName1+"  "+ averageTeam1+ "  фрагів");
            System.out.println(" У Команди "+ teamName2+"  "+averageTeam2+ "  фрагів");
        }
    }
}
