package by.epam.tasks.multidimensional;

// Сформировать квадратную матрицу порядка N по правилу:() и подсчитать количество положительных элементов в ней.

import java.util.Scanner;

public class Task7 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input n");
        int n = in.nextInt();
        double[][] a = new double[n][n];

        double plus = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = Math.sin((Math.pow(i, 2)-Math.pow(j, 2))/n);
                if (a[i][j] > 0) plus += a[i][j];
            }
        }

        for (int i = 0; i < n; i++){
            for (double k : a[i]){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println("sum of positive values "+plus);
    }
}
