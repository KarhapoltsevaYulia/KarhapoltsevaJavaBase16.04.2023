package ua.hillel.karhapoltseva.lessons.lesson14;

public class Iphones implements Smartphones,Ios{
    @Override
    public void call() {
        System.out.println("iPhones call");
    }
    @Override
    public void sms() {
        System.out.println("iPhones sms ");
    }
    @Override
    public void internet() {
        System.out.println("iPhones internet");
    }
    @Override
    public void qauickCommandsIos() {
        System.out.println("iPhones qauickCommands");
    }

    @Override
    public void appleIdIos() {
        System.out.println("iPhones appleId");
    }
}
