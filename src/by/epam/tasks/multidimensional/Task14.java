package by.epam.tasks.multidimensional;

/*  Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
    единиц равно номеру столбца.
*/

import java.util.Random;
import java.util.Scanner;

public class Task14 {
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
                a[i][k] = i - k < 0 ? 1 : 0;

        for (int i = 0; i < n; i++){
            for (int k = 0; k < m; k++){
                System.out.print(a[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
