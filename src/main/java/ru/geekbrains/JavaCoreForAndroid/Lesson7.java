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
public class Lesson7 {
    // Тестовый массив с неверным размером
    private static String[][] str1 = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
    // тестовый массив с неконвертируемым значением
    private static String[][] str2 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "Десять", "11", "12"}, {"13", "14", "15", "16"}};
    // тестовый массив правильный
    private static String[][] str3 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};

    public static void main(String[] args) {
        // Задание 5, 6 и 7.
        System.out.println("\n обрабатываем массив str3...");
        try {
            System.out.println("Сумма всех элементов массива str3 = "+ MyMethodEx(str3));
        } catch (MyArrayDataException e){
            System.out.println(e);
            System.out.println("Достоверный результат расчета суммы получен быть не может!");
        } catch (MyArraySizeException e){
            System.out.println(e);
            System.out.println("Достоверный результат расчета суммы получен быть не может!");
        }
        System.out.println("\n обрабатываем массив str2...");
        try {
            System.out.println("Сумма всех элементов массива str3 = "+ MyMethodEx(str2));
        } catch (MyArrayDataException e){
            System.out.println(e);
            System.out.println("Достоверный результат расчета суммы получен быть не может!");
        } catch (MyArraySizeException e){
            System.out.println(e);
            System.out.println("Достоверный результат расчета суммы получен быть не может!");
        }
        System.out.println("\n обрабатываем массив str1...");
        try {
            System.out.println("Сумма всех элементов массива str3 = "+ MyMethodEx(str1));
        } catch (MyArrayDataException e){
            System.out.println(e);
            System.out.println("Достоверный результат расчета суммы получен быть не может!");
        } catch (MyArraySizeException e){
            System.out.println(e);
            System.out.println("Достоверный результат расчета суммы получен быть не может!");
        }

        //System.out.println("Сумма всех элементов массива str3 = "+ MyMethodEx(str2)); // для тестирования раскомментировать.
        // System.out.println("Сумма всех элементов массива str3 = "+ MyMethodEx(str1)); // для тестирования раскомментировать.
    }

    public static int MyMethodEx (String[][] str) throws RuntimeException{
        int sum = 0;
        if(str.length!=4 || str[0].length!=4) throw new MyArraySizeException("Массив не соответствует размерности 4х4!");
        for(int y = 0; y < str.length; y++){
            for (int x = 0; x<str[y].length; x++){
                try {
                    sum += Integer.parseInt(str[y][x]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("В переданном массиве элемент с Array["+y+"]["+x+"] НЕ может быть конвертирован в число!!!");
                }
            }
        }
        return sum;

    }
}
