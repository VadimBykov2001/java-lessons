package ru.tn.courses.vbogatyrev.v1.task1;

import java.util.Scanner;

public class Subtask_3 {
    /**
     * Даны две последовательности a1 ≤ a2 ≤ ... ≤ аn и b1 ≤ b2 ≤ ... ≤ bn. Образовать из них новую последовательность
     * чисел так, чтобы она тоже была неубывающей (дополнительный массив не использовать).
     */

    public static void main(String[] args) {
        int[] a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину последовательностей n:");

        int n = scanner.nextInt();
        a = new int[n];
        b = new int[n];

        System.out.println("Введите последовательность a:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Введите последовательность b:");
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println("Новая последовательность без нового массива:");
        for (int i = 0, j = 0; i < n && j < n; j++) {
            while (i < n && a[i] <= b[j]) {
                System.out.println(a[i++]);
            }
            System.out.println(b[j]);
        }
    }
}
