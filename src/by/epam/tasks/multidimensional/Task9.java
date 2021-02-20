package by.epam.tasks.multidimensional;

/*  Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
    столбец содержит максимальную сумму.
*/

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input n");
        int n = in.nextInt();
        System.out.println("Input m");
        int m = in.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int k = 0; k < m; k++)
                a[i][k] = random.nextInt(100)+1;

        for (int i = 0; i < n; i++){
            for (int k = 0; k < m; k++){
                System.out.print(a[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println();

        int[] counts = new int[n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                counts[j] += a[i][j];
        }

        for(int k : counts)
            System.out.print(k+" ");
    }
}
