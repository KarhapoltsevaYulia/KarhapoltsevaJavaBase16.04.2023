package ua.hillel.karhapoltseva.lessons.lesson11;

public class Burger {
    String bun;
    String meat;
    String doubleMeat;
    String cheese;
    String greenery;
    String mayonnaise;

    public Burger(String bun, String meat, String doubleMeat, String cheese, String greenery, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.doubleMeat = doubleMeat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        System.out.println("Double meat burger: "+bun+", "+meat+", "+doubleMeat+", "+cheese+", "+greenery+", "+mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greenery) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        System.out.println("Diet burger: "+bun+", "+meat+", "+cheese+", "+greenery);
    }

    public Burger(String bun, String meat, String cheese, String greenery, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        System.out.println("Regular burger: "+bun+", "+meat+", "+cheese+", "+ greenery+", "+mayonnaise);
    }
}
