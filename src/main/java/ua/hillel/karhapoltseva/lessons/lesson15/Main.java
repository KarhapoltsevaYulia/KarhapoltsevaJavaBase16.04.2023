package ua.hillel.karhapoltseva.lessons.lesson15;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static final String red = "\u001B[31m";
    public static final String black = "\u001B[30m";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temp2=0,test=20;
        int[] arrays = new int[test];

        while (true) {
            System.out.println(red+"You wish to make a choice of drink? Please enter YES/NO" +
                    " or Yes/No or (Y/N) or (y/n)!! "+black);
            String userYesNo=scanner.nextLine().toUpperCase();
            if (userYesNo.contains("YES")||(userYesNo.contains("Y"))) {
                temp2++;
                arrays[0]= arrays[temp2];

                DrinksMachine  userValueDrink=userValueDrinkMachine(scanner);
                userDrink(userValueDrink,arrays,temp2);

            } else if (userYesNo.contains("NO")||(userYesNo.contains("N"))){
                chek(arrays,temp2);
                break;
            }
            System.out.println();
        }
    }

    private static void chek(int[] arrays, int temp2) {
        DrinksMachine[] values= DrinksMachine.values();
        System.out.println("        Your check");

        for (DrinksMachine drinks :DrinksMachine.values()) {
            for (int i = 1; i <temp2+1 ; i++) {
                if(drinks.ordinal()==arrays[i]) {
                    System.out.println(drinks.getDrinkType());
                }
            }
        }
        Drinks.printSum();
    }

    public static int[] userDrink(DrinksMachine userValueDrink,int arrays[],int temp2) {
        int temp=0;
        switch (userValueDrink) {
            case COFFEE: {
                createDrinks(userValueDrink);
                temp = DrinksMachine.valueOf("COFFEE").ordinal();
                break;
            }
            case TEA: {
                createDrinks(userValueDrink);
                temp = DrinksMachine.valueOf("TEA").ordinal();
                break;
            }
            case LEMONADE: {
                createDrinks(userValueDrink);
                temp = DrinksMachine.valueOf("LEMONADE").ordinal();
                break;
            }
            case MOXITO: {
                createDrinks(userValueDrink);
                temp = DrinksMachine.valueOf("MOXITO").ordinal();
                break;
            }
            case MINERALKA: {
                createDrinks(userValueDrink);
                temp = DrinksMachine.valueOf("MINERALKA").ordinal();
                break;
            }
            case COCA_COLA: {
                createDrinks(userValueDrink);
                temp= DrinksMachine.valueOf("COCA_COLA").ordinal();
                break;
            }
        }
        arrays[temp2] = temp;
        return arrays;
    }
    public static void createDrinks(DrinksMachine userValueDrink ){
        DrinksMachine.drinksMachine(userValueDrink);
        Drinks.sumUser(userValueDrink);
        Drinks.printSum();
    }
    public static DrinksMachine userValueDrinkMachine(Scanner scanner){

        String userValue = null;
        DrinksMachine userValueDrink = null;
        int userQuantityDrink=0;

        while (userValueDrink == null){
            System.out.print("Please enter drink "+Arrays.toString(DrinksMachine.values())+" :");

            try{
                userValue = scanner.nextLine().toUpperCase();
                userValueDrink = DrinksMachine.valueOf(userValue);

            }catch (IllegalArgumentException e){
                System.out.println(red+"Wrong data"+black);
            }
        }
        while(userQuantityDrink==0) {
            System.out.print("Enter number of drinks :");
            userQuantityDrink = inputValidation(scanner);
            SumDrink.setQuantityDrinks(userQuantityDrink);
            scanner.nextLine();
        }
        return userValueDrink;
    }
    static int inputValidation(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                if ((temp >= 0)) {
                    return temp;

                } else {
                    System.out.print(red+"You entered a negative number. Enter a positive number!"+black);
                }
            } else {
                System.out.print(red+"Wrong data!"+black);
            }
            scanner.nextLine();
        }
    }
}
/*Інструменти для використання:
1) enum (напої)
2) константи (ціни)
3) static (загальна вартість)
4) switch (вибір напою)

Завдання:

#1 зробіть enum DrinksMachine, який вміє робити КАВУ, ЧАЙ, ЛИМОНАД, МОХІТО, МИНЕРАЛКУ, КОКА_КОЛУ;
#2 Зробіть клас Drinks, де константами задайте ціну напою;
#3 Зробіть підрахунок кількості виготовлених напоїв та загальної суми, яку повинен заплатити клієнт;
#4 Зробіть спосіб приготування кожного напою;
#5 Зробіть switch-case оператор, який буде робити напій (викликаючи відповідний метод) в залежності від вибору клієнта;
#6 Додайте можливість вибору напою для користувача і залежно від вибору робіть йому напій;
#7 Користувач повинен мати можливість замовити кілька напоїв
#8 І насамкінець клієнт має побачити, скільки грошей він повинен заплатити;

Приклад перетворення рядка в enum:
String drinksChoice = "tea";
drinksChoice.toUpperCase();
Drinks drinks = Drinks.valueOf(drinksChoice);*/