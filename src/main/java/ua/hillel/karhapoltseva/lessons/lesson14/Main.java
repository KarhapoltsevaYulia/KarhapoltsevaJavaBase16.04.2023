package ua.hillel.karhapoltseva.lessons.lesson14;

public class Main {
    public static void main(String[] args) {
        objectAndroids();
        objectIphones();
        objectSmarthones();
        objectLinuxOs();
        objectIos();

        Ios[] iosMas = {
              new Iphones(),
        };

         LinuxOs[] linuxOs ={
              new Androids(),
         };

         Smartphones[] smartphones = {
              new Iphones(),
              new Androids()
         };

        for (Ios ios1:iosMas) {
            ios1.qauickCommandsIos();
            ios1.appleIdIos();
        }

        for (LinuxOs linuxOs1:linuxOs) {
            linuxOs1.systemLinuxOs();
        }

        for (Smartphones smartphones1:smartphones) {
            smartphones1.sms();
            smartphones1.call();
            smartphones1.internet();
        }
    }

    private static void objectIos() {
        Ios ios = new Ios() {
            @Override
            public void qauickCommandsIos() {
                System.out.println("Ios object qauickCommandsIos");
            }
            @Override
            public void appleIdIos() {
                System.out.println("Ios object appleIdIos");
            }
        };
        ios.appleIdIos();
        ios.qauickCommandsIos();
    }

    private static void objectLinuxOs() {
        LinuxOs linuxOs = new LinuxOs() {
            @Override
            public void systemLinuxOs() {
                System.out.println("LinuxOs object systemLinuxOs!");
            }
        };
    }

    private static void objectSmarthones() {
        Smartphones smartphones = new Smartphones() {
            @Override
            public void call() {
                System.out.println("Smartphones object Call!");
            }
            @Override
            public void sms() {
                System.out.println("Smartphones object sms!");
            }
            @Override
            public void internet() {
                System.out.println("Smartphones object internet!");
            }
        };
        smartphones.call();
        smartphones.internet();
        smartphones.sms();
    }

    private static void objectIphones() {
        Iphones iphones = new Iphones();
        iphones.appleIdIos();
        iphones.call();
        iphones.internet();
        iphones.qauickCommandsIos();
        iphones.sms();
    }

    private static Object objectAndroids() {
        Androids androids = new Androids();
        androids.call();
        androids.sms();
        androids.internet();
        androids.systemLinuxOs();
        return androids;
    }
}
/*Зробіть інтерфейс Smartphones, який має містити методи call(), sms(), internet()

Зробіть класи, які його імплементують: Androids, iPhones.

Андроїди повинні також імплементувати LinuxOS, айфони повинні імплементувати iOS

Створіть екземпляри кожного виду у мейн-класі*/