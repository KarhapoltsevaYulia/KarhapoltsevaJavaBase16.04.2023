package ua.hillel.karhapoltseva.lessons.lesson13;

public class ClassicMusic extends MusicStyles {
 String name;

    public ClassicMusic(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void playMusic() {
        System.out.println(getName()+" Play music: Classic");
    }
}
