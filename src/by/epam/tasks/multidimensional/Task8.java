package by.epam.tasks.multidimensional;

/*. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
    на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
    пользователь с клавиатуры.
*/

import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input n");
        int n = in.nextInt();
        System.out.println("Input number 1");
        int numberFirst = in.nextInt();
        System.out.println("Input number 2");
        int numberSecond = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int k = 0; k < n; k++)
                a[i][k] = random.nextInt(100)+1;
        for (int i = 0; i < n; i++){
            for (int k = 0; k < n; k++){
                System.out.print(a[i][k]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++){
            int tmp = a[i][numberFirst-1];
            a[i][numberFirst-1] = a[i][numberSecond-1];
            a[i][numberSecond-1] = tmp;
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
