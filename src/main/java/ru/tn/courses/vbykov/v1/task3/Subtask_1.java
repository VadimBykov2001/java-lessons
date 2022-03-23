package ru.tn.courses.vbykov.v1.task3;

public class Subtask_1 {
    /**
     * (Задание 1 варианта) Разработать класс Integer
     * - класс должен содержать конструкторы Integer(), Integer(int x), Integer(String s)
     * - Реализовать метод сравнения двух объектов класса Integer
     * - Реализовать методы добавления значения add(Integer i), вычитания, умножения и деления
     * - Реализовать метод возведения в степень pow(int exponent)
     * - реализовать методы преставления числа в восьмеричной и шестнадцатеричной СС
     */
    public static void main(String[] args) {
        Integer a = new Integer(0);
        Integer b = new Integer("-2");
        Integer c = b.pow(2);
        System.out.println(c);
        System.out.println(c.toOctalString());
        System.out.println(c.toHexString());
    }
}
