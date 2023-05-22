package ua.hillel.karhapoltseva.lessons.lesson12;
import java.util.Scanner;

public class Main {
    public static final String red = "\u001B[31m";
    public static final String black = "\u001B[30m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user;
        System.out.println("Введіть кількість користувачів, для фітнес трекеру:");
        user = inputValidation(sc);
        sc.nextLine();

        Person[] person=new Person[user];
         for (int i = 0; i < user; i++) {

             System.out.println("Введіть данні "+(i+1)+" користувача!!! ");
             System.out.print("Введіть  ім'я ");
             String name = examination(sc);
             System.out.print("Введіть  прізвище ");
             String surname = examination(sc);
             System.out.print("Введіть  рік  народження ");
             int year = inputValidationYear(sc);
             sc.nextLine();
             System.out.print("Введіть  місяць  народження ");
             int month = inputValidationMonth(sc);
             sc.nextLine();
             System.out.print("Введіть  день  народження ");
             int day = inputValidationDay(sc,month);
             sc.nextLine();
             System.out.print("Введіть  вес ");
             int weight = inputValidation(sc);
             sc.nextLine();
             System.out.print("Введіть  тиск, верхне значення ");
             int upperPressure=inputValidation(sc);
             sc.nextLine();
             System.out.print("Введіть  тиск, нижне значення ");
             int lowerPressure=inputValidation(sc);
             sc.nextLine();
             System.out.print("Введіть кількість пройдений кроків за 1 день ");
             int numberOfStepsPerDay=inputValidation(sc);
             sc.nextLine();
             System.out.print("Введіть   ваш email ");
             String email = examination(sc);
             System.out.print("Введіть  ваш номер телефону ");
             String telephone = examination(sc);

             person[i] = new Person(name, year, month, day, email, telephone, surname,
                     weight, upperPressure,lowerPressure, numberOfStepsPerDay);
             System.out.println();
         }

        do {
            System.out.println();
            printUser(person);
            System.out.println();
            System.out.println("Введіть порядковий номер користувача, якого ви хочете змінити ");
            System.out.println("Користувачів  "+ (person.length));

            for (int i = 0; i < person.length; i++) {
                System.out.println((i+1)+") "+ person[i].getName());
            }

            int temp  = inputValidationUser(sc,person.length);

            if (temp <= person.length) {
                System.out.println();
                person[temp - 1].printAccountInfo();
                System.out.println("Введіть номер параметра, який хочете змінити: ");
                System.out.println("1.Прізвище ");
                System.out.println("2.Вага ");
                System.out.println("3.Тиск");
                System.out.println("4. Кількість пройдених за день кроків ");
                int temp2 = inputValidationParameter(sc);
                sc.nextLine();
                System.out.println();
                switch (temp2) {
                    case 1: {
                        System.out.print("Введіть нове прізвище ");
                        person[temp - 1].setSurname(examination(sc));
                        break;
                    }
                    case 2: {
                        System.out.print("Введіть нову вагу ");
                        person[temp - 1].setWeight(inputValidation(sc));
                        break;
                    }
                    case 3: {
                        System.out.print("Введіть новий тиск. Верхнє : ");
                        person[temp - 1].setUpperPressure(inputValidation(sc));
                        System.out.print("Нижнє: ");
                        person[temp - 1].setLowerPressure(inputValidation(sc));
                        person[temp-1].setPressure(person[temp-1].getUpperPressure()+" /"+person[temp-1].getLowerPressure());
                        break;
                    }
                    case 4: {
                        System.out.print("Введіть нове значення кількості кроків ");
                        person[temp - 1].setNumberOfStepsPerDay(inputValidation(sc));
                        sc.nextLine();
                        break;
                    }
                }
                printUser(person);
            }
            System.out.println("Press  Enter");
           sc.nextLine();
            System.out.println("Хочете продовжити зміни у користувача?(Y/N)");
        } while (examinationYesNo(sc));
    }
    static boolean examinationYesNo (Scanner scanner) {
        while(true) {
            boolean yesNo;
            if (scanner.hasNextLine()) {
                String temp2 = scanner.nextLine();
                if (temp2.length() == 0 ||  temp2.contains(" ")||temp2.contains("\n")) {
                    System.out.print(red+"Ви нічого не ввели "+black);
                } else {
                    if (temp2.contains("Y") || temp2.contains("N")||temp2.contains("y")||temp2.contains("n")){
                        if (temp2.contains("Y")||temp2.contains("y")) {
                            yesNo =true;
                            } else {
                            yesNo = false;
                             }
                        return yesNo;
                    } else System.out.println("Натисність (Y/N) або (y/n) ");
                }
            }
        }
    }

    static void printUser(Person[] person){
        for (int i = 0; i < person.length; i++) {
            System.out.println();
            person[i].printAccountInfo();
        }
    }
    static int inputValidationParameter(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if ((temp > 0) && (temp<=4)) {
                    return temp;
                } else {
                    System.out.print(red+"Ви ввели неможливий параметр!"+black);
                }
            } else {
                System.out.print(red+"Ви ввели не параметр!"+black);
            }
            scanner.nextLine();
        }
    }
    static String examination (Scanner scanner) {
        while(true) {
            if (scanner.hasNextLine()) {
                String temp2 = scanner.nextLine();
                if (temp2.length() == 0 || (temp2.length() == 1 && temp2.contains(" "))) {
                    System.out.print(red+"Ви нічого не ввели "+black);
                }
                else {
                    return temp2;
                }
            }
        }
    }
    static int inputValidationDay(Scanner scanner,int month) {
        while (true) {
            if (scanner.hasNextInt()) {
                int day = scanner.nextInt();
                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12: {
                        if ((day > 0) && (day < 31)) {
                            return day;
                        } else {
                            System.out.print(red+"Ви ввели неможливий день народження!"+black);
                            break;
                        }
                    }
                    case 4, 6, 9, 11: {
                        if ((day > 0) && (day < 30)) {
                            return day;
                        } else {
                            System.out.print(red+"Ви ввели неможливий день народження!"+black);
                            break;
                        }
                    }
                    case 2: {
                        if ((day > 0) && (day <=28)) {
                            return day;
                        } else {
                            System.out.print(red+"Ви ввели неможливий день народження!"+black);
                            break;
                        }
                    }
                }
            } else {
                System.out.print(red+"Ви ввели неможливий день народження! Натисніть Enter"+black);
                scanner.nextLine();
            }
            scanner.nextLine();
        }
    }
    static int inputValidationMonth(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int month = scanner.nextInt();
                if ((month > 0) && (month<=12)) {
                    return month;
                } else {
                    System.out.print(red+"Ви ввели неможливий місяць народження!"+black);
                }
            } else {
                System.out.print(red+"Ви ввели не місяць народження!"+black);
            }
            scanner.nextLine();
        }
    }
    static int inputValidationYear(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int year = scanner.nextInt();
                if ((year >= 1900) && (year<=2021)) {
                    return year;
                } else {
                    System.out.print(red+"Ви ввели неможливий рік народження!"+black);
                }
            }  else {
                System.out.print(red+"Ви ввели не рік народження!"+black);
            }
            scanner.nextLine();
        }
    }
    static int inputValidationUser(Scanner scanner,int length) {
        while (true) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if ((temp > 0)&&(temp<=length)) {
                    return temp;

                } else {
                    System.out.print(red+"Ви ввели число, яке більше або менше вказаного діапазону!!!"+black);
                }
            } else {
                System.out.print(red+"Ви ввели не число!"+black);
            }
            scanner.nextLine();
        }
    }
    static int inputValidation(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if ((temp > 0)) {
                    return temp;

                } else {
                    System.out.print(red+"Ви ввели від'ємнє число. Введіть додатнє число!"+black);
                }
            } else {
                System.out.print(red+"Ви ввели не число!"+black);
            }
            scanner.nextLine();
        }
    }
}

/*Зробіть програму для фітнес трекера, яка реєструватиме нового користувача створюючи
 йому обліковий запис, приймаючи наступні параметри:

    Незмінні (задаються тільки при створенні облікового запису, і можуть бути отримані лише за допомогою гетерів):
        Ім'я
        Дата народження (окремо день, місяць, рік)
        Емейл
        Телефон
    Змінювані:
        Прізвище
        Вага
        Тиск
        Кількість пройдених за день кроків
Створювати кожного користувача необхідно через конструктор, беручи всі поля на вхід конструктора.
Додати метод printAccountInfo(), при виклику якого друкувати всі дані про користувача
Після прийому року народження - вираховувати вік користувача у внутрішню змінну age
(відштовхуючись просто від 2020 року, ускладнювати тут не будемо), на яку зробити тільки геттер
 і виводити на екран разом з іншими полями в методі printAccountInfo(); у конструкторі або геттерах/сеттерах
  не використовуємо виведення в консоль.*/
/*
У main-класі створити 3-5 користувачів та роздрукувати дані кожного через виклик методу printAccountInfo();
для двох користувачів змінити кілька полів та роздрукувати нові дані повторно
 */