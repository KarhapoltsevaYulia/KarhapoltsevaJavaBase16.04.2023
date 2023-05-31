package ua.hillel.karhapoltseva.lessons.lesson15;

public class Drinks extends SumDrink{
    public static final int COFFEE_PRICE=20;
    public static final int TEA_PRICE=10;
    public static final int LEMONADE_PRICE=15;
    public static final int MOXITO_PRICE=25;
    public static final int MINERALKA_PRICE=15;
    public static final int COCA_COLA_PRICE=20;

    public static void sumUser (DrinksMachine drinksMachine){

         switch (drinksMachine){
             case COFFEE: {
                 sumUserPay(COFFEE_PRICE);
                 break;
             }
             case TEA: {
                 sumUserPay(TEA_PRICE);
                 break;
              }
             case LEMONADE: {
                 sumUserPay(LEMONADE_PRICE);
                 break;
             }
             case MOXITO: {
                 sumUserPay(MOXITO_PRICE);
                 break;
             }
             case MINERALKA: {
                 sumUserPay(MINERALKA_PRICE);
                 break;
             }
             case COCA_COLA: {
                 sumUserPay(COCA_COLA_PRICE);
                 break;
             }
         }
    }
}
