package ua.hillel.karhapoltseva.lessons.lesson10;

import com.sun.source.tree.BreakTree;

public class Person {
    public static void main(String[] args) {
        String  name= " Will";
        String  surname = "Smith";
        String    city = "New York";
        String   telephone= "2936729462846";
        examination(name, surname,city,telephone);
        System.out.println(personInfo(name, surname,city,telephone));

        name = "Jackie";
        surname = "Chan";
        city = "Shanghai";
        telephone ="12312412412";
        examination(name, surname,city,telephone);
        System.out.println(personInfo(name, surname,city,telephone));

        name = "Sherlock";
        surname = "Holmes";
        city = "London";
        telephone ="37742123513";
        examination(name, surname,city,telephone);
        System.out.println(personInfo(name, surname,city,telephone));
    }
     static String personInfo(String name, String surname, String city, String telephone ){
      return "Зателефонувати громадянинові "+name+" "+surname+" з міста "+city+" можна за номером "+telephone;
    }
    static void examination (String name, String surname, String city, String telephone){

        if (name.length() == 0 ||(name.length()==1 && name.contains(" "))) {
            System.out.println("Ви не ввели ім'я");
        }
        if ( surname.length()== 0 ||(surname.length()==1 && surname.contains(" "))) {
            System.out.println("Ви не ввели прізвище");
        }
        if (city.length() == 0|| (city.length()==1 && city.contains(" "))) {
            System.out.println("Ви не ввели місто");
        }
        if (telephone.length() == 0|| (telephone.length()==1 && telephone.contains(" "))) {
            System.out.println("Ви не ввели телефон");
        }
    }
}
