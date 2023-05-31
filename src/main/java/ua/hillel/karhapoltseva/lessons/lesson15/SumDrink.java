package ua.hillel.karhapoltseva.lessons.lesson15;

public class SumDrink {
    private static int sum;
    private static int quantityDrinks;
    private static int numberPreparedDrinks;

    public static void printSum(){
        System.out.println("To pay "+ getSum()+" hryvnia ");
        System.out.println("Number of drinks ordered = "+ getNumberPreparedDrinks()+" ! ");
    }

    public static void setQuantityDrinks(int quantityDrinks) {
        SumDrink.quantityDrinks = quantityDrinks;
    }
    public  static void sumUserPay (int drinks){
        sum+= drinks*quantityDrinks;
        numberPreparedDrinks+=quantityDrinks;
    }
    public static int getSum() {
        return sum;
    }
    public static int getNumberPreparedDrinks() {
        return numberPreparedDrinks;
    }
}
