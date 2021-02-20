package by.epam.tasks.multidimensional;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import java.util.Scanner;

public class Task5 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input n");
        int n = in.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int k = 0; k < n; k++)
                a[i][k] = k < n-i ?i+1:0;
        }

        for (int i = 0; i < n; i++){
            for (int k = 0; k < n; k++){
                System.out.print(a[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
