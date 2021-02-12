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
public class Wall {
    private String name;        // наименование препятствия или его порядковый номер, на будущее.
    private double height;      // высота стенки.

    public Wall(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Стенка (" + name + ") высотой: " + height +"м.";
    }
}
