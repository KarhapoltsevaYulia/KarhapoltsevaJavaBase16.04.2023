package ua.hillel.karhapoltseva.lessons.lesson15;

public enum DrinksMachine {
    COFFEE("Кава"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOXITO("Мохито"),
    MINERALKA("Мінеральна вода"),
    COCA_COLA("Кока-Кола");
    private final String drinkType;

    public String getDrinkType() {
        return drinkType;
    }
    DrinksMachine(String drinkType) {
        this.drinkType = drinkType;
    }
    public static void drinksMachine(DrinksMachine drinksMachine){
        System.out.println("Please wait for your "+drinksMachine+" drink to be prepared");
    }
}
