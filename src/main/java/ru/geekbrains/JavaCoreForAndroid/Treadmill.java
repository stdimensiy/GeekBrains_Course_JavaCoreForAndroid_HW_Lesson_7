package ru.geekbrains.JavaCoreForAndroid;

/**
 * Сourse: java core for android
 * Faculty of Geek University Android Development
 *
 * @Author Student Dmitry Veremeenko aka StDimensiy
 * Group 24.12.2020
 * <p>
 * HomeWork for lesson 7
 * Created 10.02.2021
 * v1.0
 */
public class Treadmill {
    private String name;        // наименование препятствия или его порядковый номер, на будущее.
    private int distance;       // протяженность.

    public Treadmill(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Беговая дорожка (" + name + " забег на дистанцию: " + distance +"м.";
    }
}
