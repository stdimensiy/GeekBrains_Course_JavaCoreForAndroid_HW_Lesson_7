package ru.geekbrains.JavaCoreForAndroid;

/**
 * Сourse: java core for android
 * Faculty of Geek University Android Development
 *
 * @Author Student Dmitry Veremeenko aka StDimensiy
 * Group 24.12.2020
 *
 * HomeWork for lesson 7
 * Created 10.02.2021
 * v1.0
 */
public class Human {
    private String name;
    private double maxHeight;      // максимальная высота на на которую может подняться участник
    private int maxRun;            // предельное расстояние непрерывного бега участника

    public Human(String name, double maxHeight, int maxRun) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxRun = maxRun;
    }

    public void run(int distance){
        System.out.println("Человек пробежал " + distance);
    }

    public void jump(double height){
        System.out.println("Человек подпрыгнул на " + height +"м.");
    }

    public String getName() {
        return name;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public int getMaxRun() {
        return maxRun;
    }
}
