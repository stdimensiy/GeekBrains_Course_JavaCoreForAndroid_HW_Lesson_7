package ru.geekbrains.JavaCoreForAndroid;

import java.util.Arrays;

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
public class Lesson7 {
    // Тестовый массив с неверным размером
    private static String[][] str1 = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
    // тестовый массив с неконвертируемым значением
    private static String[][] str2 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "Десять", "11", "12"}, {"13", "14", "15", "16"}};
    // тестовый массив правильный
    private static String[][] str3 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};


    public static void main(String[] args) {
        String nameParticipant = "";
        String nameObstacle;
        //задание №1,2,3 и 4 "бег с препятствиями"
        System.out.println("\n \"Бег с препятствиями\"...");
        //создаем массив объектов (участников забега)
        Object[] participants = new Object[9];
        participants[0] = new Cat("Мурзик (старый)", 2.1, 400);
        participants[1] = new Cat("Барсик", 2.2, 4000);
        participants[2] = new Cat("Кекс", 3.1, 15000);
        participants[3] = new Human("Майор Деревянко", 2.1, 3000);
        participants[4] = new Human("Лейтенант Летяга", 2.2, 5000);
        participants[5] = new Human("Рядовой Непромах", 2.5, 10000);
        participants[6] = new Robot("R2-D2", 1.8, 15000);
        participants[7] = new Robot("C-3PO", 1.3, 5000);
        participants[8] = new Robot("K-2SO", 2.5, 10000);
        // Создаем массив препятствий (решил сделать их в перемешку)
        Object[] obstacles = new Object[6];
        obstacles[0] = new Treadmill("забег по прямой ", 500);
        obstacles[1] = new Wall("Малая стенка", 1.2);
        obstacles[2] = new Treadmill("дорога - асфальт ", 3000);
        obstacles[3] = new Wall("Средняя стенка", 1.8);
        obstacles[4] = new Treadmill("булыжник ", 1000);
        obstacles[5] = new Wall("Высокая стенка", 2.3);
        // погнали...
        System.out.println("Тренировочный забег смешанного типа: Коты, Люди, Роботы");
        // возможно я неправильно понял задание и не смог принять решение в каком объекте будет находится логика
        // принятия решения о результате взаимодействия объектов, в данном случае, так как результат взаимодействия
        // объектов не влияет на содержащуюся в объектах информацию вынести логику принятия решения вне
        // взаимодействующих объектов. Как бы "судье" которым в данном случае является метод main.
        for (Object participant : participants) {
            int vMaxRun = 0;        //возможность бежать
            double vMaxHeight = 0;  //возможность прыгать

            System.out.print("На полосу препятствий выходит ");
            if (participant instanceof Cat) {
                nameParticipant = ((Cat) participant).getName();
                vMaxRun = ((Cat) participant).getMaxRun();
                vMaxHeight = ((Cat) participant).getMaxHeight();
            }
            if (participant instanceof Human) {
                nameParticipant = ((Human) participant).getName();
                vMaxRun = ((Human) participant).getMaxRun();
                vMaxHeight = ((Human) participant).getMaxHeight();
            }
            if (participant instanceof Robot) {
                nameParticipant = ((Robot) participant).getName();
                vMaxRun = ((Robot) participant).getMaxRun();
                vMaxHeight = ((Robot) participant).getMaxHeight();
            }

            System.out.println(nameParticipant + " ТТХ: бег " + vMaxRun + " прыжок " + vMaxHeight);
            boolean failure = false;
            System.out.print("СТАРТ!   ");
            for (int y = 0; y < obstacles.length; y++) {
                int tRun = 0;
                double tHeight = 0;
                if (obstacles[y] instanceof Treadmill) {
                    nameObstacle = ((Treadmill) (obstacles[y])).getName();
                    tRun = ((Treadmill) (obstacles[y])).getDistance();
                    if (tRun > vMaxRun) {
                        System.out.println(" Участник: " + nameParticipant + " сошел с дистанции на препятствии №" +
                                (y + 1) + " " + nameObstacle + "(" + tRun + "м.) \n");
                        failure = true;
                        break;
                    }
                }
                if (obstacles[y] instanceof Wall) {
                    nameObstacle = ((Wall) (obstacles[y])).getName();
                    tHeight = ((Wall) (obstacles[y])).getHeight();
                    if (tHeight > vMaxHeight) {
                        System.out.println(" Участник: " + nameParticipant + " сошел с дистанции на препятствии №" +
                                (y + 1) + " " + nameObstacle + "(" + tHeight + "м.) \n");
                        failure = true;
                        break;
                    }

                }
            }
            if (!failure) {
                System.out.println(" Участник: " + nameParticipant + " успешно выдержал все испытания!!!\n\n");
            }
        }


        // Задание 5, 6 и 7.
        System.out.println("\n\n\n Домашнее задение пункты 5, 6 и 7\n Обрабатываем массив str3...");
        try {
            System.out.println("Сумма всех элементов массива str3 = " + MyMethodEx(str3));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e);
            System.out.println("Достоверный результат расчета суммы получен быть не может!");
        }
        System.out.println("\n обрабатываем массив str2...");
        try {
            System.out.println("Сумма всех элементов массива str3 = " + MyMethodEx(str2));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e);
            System.out.println("Достоверный результат расчета суммы получен быть не может!");
        }
        System.out.println("\n обрабатываем массив str1...");
        try {
            System.out.println("Сумма всех элементов массива str3 = " + MyMethodEx(str1));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e);
            System.out.println("Достоверный результат расчета суммы получен быть не может!");
        }
    }

    public static int MyMethodEx(String[][] str) throws RuntimeException {
        int sum = 0;
        if (str.length != 4 || str[0].length != 4)
            throw new MyArraySizeException("Массив не соответствует размерности 4х4!");
        for (int y = 0; y < str.length; y++) {
            for (int x = 0; x < str[y].length; x++) {
                try {
                    sum += Integer.parseInt(str[y][x]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В переданном массиве элемент с Array[" + y + "][" + x + "] НЕ может быть конвертирован в число!!!");
                }
            }
        }
        return sum;

    }
}
