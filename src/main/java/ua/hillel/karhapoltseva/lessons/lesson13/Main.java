package ua.hillel.karhapoltseva.lessons.lesson13;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicStyles ={
               new  PopMusic("Akcent"),
               new  PopMusic("Backstreet Boys"),
               new  PopMusic("Aqua"),

                new RockMusic("Mad Heads"),
                new RockMusic("Esthetic Education"),
                new RockMusic("Green Grey"),

                new ClassicMusic("Beethoven"),
                new ClassicMusic("Bax"),
                new ClassicMusic("Mozart"),
        };

        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}

/*робіть клас MusicStyles, який міститиме метод playMusic()
Зробіть його спадкоємців: PopMusic, RockMusic і ClassicMusic.
Спадкоємці повинні реалізовувати метод playMusic().
У мейн-класі створіть музичні гурти для кожного стилю
За допомогою методу for each викличте у всіх спадкоємців MusicStyles метод playMusic()*/