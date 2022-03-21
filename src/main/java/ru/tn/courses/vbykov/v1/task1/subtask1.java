package ru.tn.courses.vbykov.v1.task1;
import java.util.Scanner;

public class subtask1 {
    /**
     * (Задание 1 варианта) Дан массив натуральных чисел. Найти сумму элементов, кратных данному k.
     **/

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите k:");
        int k = scanner.nextInt();
        int sum = 0;
        System.out.println("введите массив размера 5:");
        for (int i : array) {
            array[i] = scanner.nextInt();
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println("Сумма элементов массива кратных числу k = " + sum);
    }
}
