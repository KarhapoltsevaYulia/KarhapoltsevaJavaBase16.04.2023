package ua.hillel.karhapoltseva.lessons.lesson13;

import ua.hillel.karhapoltseva.lessons.lesson13.MusicStyles;

public class PopMusic extends MusicStyles {
    String name;

    public String getName() {
        return name;
    }
    public PopMusic(String name) {
        this.name = name;
    }
    @Override
   public void playMusic() {
        System.out.println(getName()+" Play music: Pop");
    }
}
