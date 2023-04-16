package ua.hillel.karhapoltseva.lessons.lesson2;

public class statue_of_liberty {
    public static void main(String[] args) {

        double latitude= 40.68920916669477350;
        double  longitude= 74.04442527780578587;
        char degree = '\u00B0';

        System.out.println("Статуя свободи, знаходиться за такими координатами: ");
        System.out.println("Широта: " + latitude + degree);
        System.out.println("Довгота:" + longitude+ degree);
//////////////////////////////////////////////////////////////////////////////
        byte latitede1 = 40;
        byte latitede2 = 41;
        byte latitede3 = 21;
        byte longitude1 = 74;
        byte longitude2 = 02;
        byte longitude3 = 39;

        System.out.println("Пн. ш.:"+latitede1+'\u00B0' + latitede2 + "'"+ latitede3+"``");
        System.out.println("Зх. д.:"+longitude1+'\u00B0' + longitude2 + "'"+ longitude3+"``");

    }
}
//40°41′21″ пн. ш. 74°02′39″ зх. д.
//﻿40.68920916669477350° пн. ш. 74.04442527780578587° зх. д.﻿
