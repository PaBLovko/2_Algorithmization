package by.epam.tasks.multidimensional;

/* Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

import java.util.Random;

public class Task12 {
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

        for(int k=0;k<n;k++) {
            for(int i=0;i<(m-1);i++) {
                for(int j=0;j<m-i-1;j++) {
                    if(a[k][j]>a[k][j+1]) {
                        int tmp = a[k][j];
                        a[k][j] = a[k][j+1];
                        a[k][j+1] = tmp;
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

        for(int k=0;k<n;k++) {
            for(int i=0;i<(m-1);i++) {
                for(int j=0;j<m-i-1;j++) {
                    if(a[k][j]<a[k][j+1]) {
                        int tmp = a[k][j];
                        a[k][j] = a[k][j+1];
                        a[k][j+1] = tmp;
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
