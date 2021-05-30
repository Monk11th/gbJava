package ru.gb.hw.hw3;

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
      System.out.println(Arrays.toString(arrayOne(new int[] {0, 1, 0, 0, 1, 0, 0, 1})) + "\n");
      System.out.println(Arrays.toString(Array100(100)) +"\n";
      System.out.println(Arrays.toString(doubleIf(new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})) + "\n");
      fillDiag(5);
      System.out.println(Arrays.toString(fillIV(6, 9)));
    }

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
public static int[] arrayOne(final int[] a) {
    for (int i = 0; i < a.length; i++) {
        if (a[i] == 0) {
            a[i] = 1;
        } else {
            a[i] = 0;
        }
    }
    return a;
}

/**
 * 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 */
public static int[] Array100(final int a) {
    int[] array = new int[a];
    for (int i = 0; i < array.length; i++) {
        array[i] = i + 1;
    }
    return array;
}

/**
 * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */
public static int[] doubleIf(final int[] a) {
    for (int i = 0; i < a.length; i++) {
        if (a[i] <6) {
            a[i] *= 2;
        }
    }
    return a;
 }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     * (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу:
     * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static void fillDiag(final int a) {
        int[][] array = new int[a][a];
        for (int i = 0; i < array.length; i++) {
            int row = array[i].length;
            for(int j = 0; j < row; j++) {
                if ((i == j) (j == row - 1 - i)) {
                    array[i][j] = 1;
                }
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    public static int[] fillIV(final int len, final  int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}