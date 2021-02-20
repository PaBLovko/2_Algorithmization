package by.epam.tasks.multidimensional;

/*. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
* */

import java.util.Random;
import java.util.Scanner;

public class Task3 {
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

        int k = 5;
        int p = 4;

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++) {
                if (k == i+1) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
        System.out.println();

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++) {
                if (p == j+1) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}
