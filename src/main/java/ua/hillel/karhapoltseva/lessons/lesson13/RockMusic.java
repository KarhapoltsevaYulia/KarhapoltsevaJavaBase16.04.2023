package ua.hillel.karhapoltseva.lessons.lesson13;

import ua.hillel.karhapoltseva.lessons.lesson13.MusicStyles;

public class RockMusic extends MusicStyles {

    String name;
    public RockMusic(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void playMusic() {
        System.out.println(getName()+" Play music: Rock");
    }
}
