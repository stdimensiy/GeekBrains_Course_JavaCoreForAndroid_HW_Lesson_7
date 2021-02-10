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
public class Robot {
    private String name;
    private double maxHeight;      // максимальная высота на на которую может подняться участник
    private int maxRun;         // предельное расстояние непрерывного бега участника

    public Robot(String name, double maxHeight, int maxRun) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxRun = maxRun;
    }

    public void run(int distance){
        System.out.println("Робот пробежал " + distance);
    }

    public void jump(double height){
        System.out.println("Робот подпрыгнул на " + height +"м.");
    }
}
