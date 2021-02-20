package by.epam.tasks.sorting;

/*Даны две последовательности a1 < a2 < ... < an и b1 < b2 < ... < bm.
    Образовать из них новую последовательность
    чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать
*/

import java.util.Arrays;

public class Task2 {

    public static void main(String[]args) {
        int N = 3;
        int M = 4;
        int[] A = new int[N];
        int[] B = new int[M];
        A[0] = 1;
        A[1] = 20;
        A[2] = 3;
        B[0] = 10;
        B[1] = 2;
        B[2] = 30;
        B[3] = 4;

        String ms = Arrays.toString(A);
        A = new int[N+M];
        System.arraycopy(B, 0, A, 0, B.length);
        B = Arrays.stream(ms.substring(1, ms.length()-1).split(","))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();
        System.arraycopy(B, 0, A, M, B.length);
        for(int i = A.length - 1; i >= 1; i--)
            for(int j = 0; j < i; j++)
                if(A[i] < A[j])
                    A[i] = A[i] + A[j] - (A[j] = A[i]);

        for(int k : A)
            System.out.print(k+" ");
    }
}
