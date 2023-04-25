package ua.hillel.karhapoltseva.lessons.lesson6;

public class Main2 {
    public static void main(String[] args) {
      // int pol = Math.E(pol);
        int o = 1;
        for (int i = 0; i < 100; i++) {
            int kol = o % 1;
            System.out.println(kol);
            if ((kol!=4) && (o!=9)) {
                System.out.println(o+" ");
            }o++;
          //  while (o%1 )
            }

        }
    }

//4 9 14 19 24 29 34 39 44 49 54 59
//1 2 3 5 6 7 8 10 11 12 13 15 16 17 18 20 21 22 23 25 26 27 28 30