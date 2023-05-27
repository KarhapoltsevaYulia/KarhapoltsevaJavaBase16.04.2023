package ua.hillel.karhapoltseva.lessons.lesson14;

public class Androids implements Smartphones, LinuxOs {
    @Override
    public void call() {
        System.out.println("Androids call!");
    }

    @Override
    public void sms() {
        System.out.println("Androids sms!");
    }

    @Override
    public void internet() {
        System.out.println("Androids internet!");
    }

    @Override
    public void systemLinuxOs() {
        System.out.println("Androids have systemLinuxOs!");
    }
}
