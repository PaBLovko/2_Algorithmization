package by.epam.tasks.multidimensional;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import java.util.Scanner;

public class Task6 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input n");
        int n = in.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                a[i][j] = (j >= i && j + i < n ) || ( j <= i && j + i >= n - 1) ?1:0;
        }

        for (int i = 0; i < n; i++){
            for (int k : a[i]){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
