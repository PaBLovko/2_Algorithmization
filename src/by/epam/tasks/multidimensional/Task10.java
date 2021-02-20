package by.epam.tasks.multidimensional;

/* Найти положительные элементы главной диагонали квадратной матрицы.
 */

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input n");
        int n = in.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int k = 0; k < n; k++)
                a[i][k] = random.nextInt(20)-10;

        for (int i = 0; i < n; i++){
            for (int k = 0; k < n; k++){
                System.out.print(a[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i == j && a[i][j] > 0)
                    System.out.print(a[i][j]+" ");

    }
}
