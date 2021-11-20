package ru.tn.courses.vbogatyrev.v1.task1;

import java.util.Scanner;

public class Subtask_1 {
    /**
     * Дан массив натуральных чисел. Найти сумму элементов, кратных данному K.
     **/

    public static void main(String[] args) {

        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите k:");

        int k = scanner.nextInt();
        int sum = 0;

        System.out.println("введите массив размера 10:");

        for (int i : array) {
            array[i] = scanner.nextInt();
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }

        System.out.println("сумма элементов массива кратных числу k = " + sum);
    }
}
