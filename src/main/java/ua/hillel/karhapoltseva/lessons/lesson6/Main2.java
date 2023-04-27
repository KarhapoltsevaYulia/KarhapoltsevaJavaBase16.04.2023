package ua.hillel.karhapoltseva.lessons.lesson6;

public class Main2 {
    public static void main(String[] args) {
        int shuttles = 1, numberShuttles = 100,value = 10, unluckyNumber1 = 4,unluckyNumber2 = 9;

       for (int i = 1; i <= numberShuttles; ) {
            int calculation = shuttles % value;
            int calculation2 = (shuttles/value)%value;
            int calculation3  = ((shuttles/value)/value)%value;

            if ((calculation!=unluckyNumber1) && (calculation!=unluckyNumber2)&&(calculation2!=unluckyNumber1)
                    &&(calculation2!=unluckyNumber2)&&(calculation3!=unluckyNumber1)&&(calculation3!=unluckyNumber2)) {
               System.out.println(i+" й шатл з № "+shuttles+" ");
               i ++;
            }
            shuttles++;
            }
        }
    }

//4 9 14 19 24 29 34 39 44 49 54 59
//1 2 3 5 6 7 8 10 11 12 13 15 16 17 18 20 21 22 23 25 26 27 28 30