package ua.hillel.karhapoltseva.lessons.lesson4;

public class Dynasties {
    public static void main(String[] args) {
     int warriorLi = 13;
     int archerLi = 24;
     int riderLi = 46;
     int warriorDynastiesLi = 860;

     int warriorMin  = 9;
     int archerMin = 35;
     int riderMin = 12;
     float a = 1.5f;
     float warriorDynastiesMin = warriorDynastiesLi * a;

     int sumWarriorLi = warriorLi * warriorDynastiesLi;
     int sumArcherLi = archerLi * warriorDynastiesLi;
     int sumRiderLi = riderLi * warriorDynastiesLi;

     float sumWarriorMin = warriorMin * warriorDynastiesMin;
     float sumArcherMin = archerMin * warriorDynastiesMin;
     float sumRiderMin = riderMin * warriorDynastiesMin;

     int kolWarriorLi=sumWarriorLi+ sumArcherLi+ sumRiderLi;
     float kolWarriorMin = sumWarriorMin + sumArcherMin + sumRiderMin;

        System.out.println("Показник атаки династії Лі:   " + kolWarriorLi);
        System.out.println("Показник атаки династії Мінь: " + (int)kolWarriorMin);

    }
}
//Лі:
//      воїн - 13          860 воинов    860*13= 11 180 /// 11 180+20 640+ 38 640= 71 380
//        лучник - 24      860 воинов    860*24= 20 640
//        вершник - 46     860  воинов   860*46= 39 560

//        Мінь:
//        воїн - 9         860*1,5 = 1290  1290*9 = 11 610 /// 11 610+45 150+15 480 = 72 240
//        лучник - 35      860*1,5 = 1290  1290*35= 45 150
//        вершник - 12     860*1,5 = 1290  1290*12= 15 480
//        Розрахувати: загальний показник атаки для обох династій, якщо відомо,
//        що воїнів династії Лі кожного типу було 860, а кількість воїнів династії Мінь
//        кожного типу в півтора рази більша.