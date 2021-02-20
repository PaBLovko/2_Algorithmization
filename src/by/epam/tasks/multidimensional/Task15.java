package by.epam.tasks.multidimensional;

/*  Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
* */

import java.util.Random;

public class Task15 {
    public static void main(String[]args){
        Random random = new Random();
        int n = 5;
        int m = 5;
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int k = 0; k < m; k++)
                a[i][k] = random.nextInt(15);

        for (int i = 0; i < n; i++){
            for (int k : a[i]){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println();

        int max = a[0][0];
        for (int[] i : a){
            for (int j : i){
                if (j > max) max = j;
            }
        }
        System.out.println(max);

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (a[i][j] % 2 != 0) a[i][j] = max;
            }
        }

        for (int i = 0; i < n; i++){
            for (int k : a[i]){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
