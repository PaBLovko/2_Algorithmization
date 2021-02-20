package by.epam.tasks.multidimensional;

/*  Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
    которых число 5 встречается три и более раз.
*/

import java.util.Random;

public class Task11 {
    public static void main(String[]args){
        Random random = new Random();
        int n = 10;
        int m = 20;
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

        for (int i = 0; i < n; i++){
            int frequency = 0;
            for (int j = 0; j < m; j++){
                if (a[i][j] == 5) frequency++;
            }
            if (frequency >= 3) System.out.print(i+" ");
        }


    }
}
