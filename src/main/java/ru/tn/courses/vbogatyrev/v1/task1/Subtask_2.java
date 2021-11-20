package ru.tn.courses.vbogatyrev.v1.task1;

import java.util.Scanner;

public class Subtask_2 {
    /**
     * У прилавка магазина выстроилась очередь из n покупателей. Время обслуживания i-того покупателя равно tj (i = 1,
     * …, n). Определить время Ci пребывания i-гo покупателя в очереди.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину очереди n:");

        int n = scanner.nextInt();
        double[] t = new double[n];
        double[] c = new double[n];

        System.out.println("Введите время обслуживания i покупателя:");

        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextDouble();
            if (i == 0) {
                c[i] = 0;
            } else {
                c[i] = c[i - 1] + t[i - 1];
            }
        }

        System.out.println("Введите пребывания i покупателя в очереди:");
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + " покупатель : " + c[i] + " единиц времени в очереди");
        }
    }
}
