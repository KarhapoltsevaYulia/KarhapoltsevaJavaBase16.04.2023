package ua.hillel.karhapoltseva.lessons.lesson12;
import java.time.LocalDate;

public class Person {
    private final String name;
    private final int yearBirthday;
    private final int monthBirthday;
    private final int dayBirthday;
    private final String email;
    private final String telephone;
    private String surname;
    private int weight;
    private String pressure;
    private int upperPressure;
    private int lowerPressure;
    public int numberOfStepsPerDay;
    private int age;

    public void setPressure(String pressure) {
        this.pressure = getUpperPressure()+"/"+getLowerPressure();
    }

    public int getUpperPressure() {
        return upperPressure;
    }

    public void setUpperPressure(int upperPressure) {
        this.upperPressure = upperPressure;
    }

    public int getLowerPressure() {
        return lowerPressure;
    }
    public void setLowerPressure(int lowerPressure) {
        this.lowerPressure = lowerPressure;
    }

    public int getNumberOfStepsPerDay() {
        return numberOfStepsPerDay;
    }
    public void setNumberOfStepsPerDay(int numberOfStepsPerDay) {
        this.numberOfStepsPerDay = numberOfStepsPerDay;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public Person(String name, int   yearBirthday, int monthBirthday, int dayBirthday,
                  String email, String telephone,
                  String surname, int weight, int upperPressure, int lowerPressure,
                  int numberOfStepsPerDay) {

        this.name = name;
        this.yearBirthday = yearBirthday;
        this.monthBirthday = monthBirthday;
        this.dayBirthday = dayBirthday;
        this.age= (LocalDate.now().getYear()-yearBirthday)-1;
        this.email = email;
        this.telephone = telephone;
        this.surname = surname;
        this.weight = weight;
        this.pressure =upperPressure+" / "+lowerPressure;
        this.numberOfStepsPerDay = numberOfStepsPerDay;
    }
 void printAccountInfo(){
    System.out.println("Name :"+this.name);
    System.out.println("Surname :"+this.surname);
    System.out.println("Birthday: "+this.dayBirthday+"."+this.monthBirthday+"."+this.yearBirthday);
    System.out.println("User age: "+getAge());
    System.out.println("Email: "+this.email);
    System.out.println("Telephone: "+this.telephone);
    System.out.println("Weight: "+this.weight);
    System.out.println("Pressure: "+this.pressure);
    System.out.println("Number of steps per day: "+this.numberOfStepsPerDay);
}

}
