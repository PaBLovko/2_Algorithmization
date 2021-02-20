package by.epam.tasks.multidimensional;

/* Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

import java.util.Random;

public class Task13 {
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

        for(int j=0;j<n;j++) {
            for(int i=0;i<(m-1);i++) {
                for(int k=0;k<m-i-1;k++) {
                    if(a[k][j]>a[k+1][j]) {
                        int tmp = a[k][j];
                        a[k][j] = a[k+1][j];
                        a[k+1][j] = tmp;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++){
            for (int k : a[i]){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println();

        for(int j=0;j<n;j++) {
            for(int i=0;i<(m-1);i++) {
                for(int k=0;k<m-i-1;k++) {
                    if(a[k][j]<a[k+1][j]) {
                        int tmp = a[k][j];
                        a[k][j] = a[k+1][j];
                        a[k+1][j] = tmp;
                    }
                }
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
