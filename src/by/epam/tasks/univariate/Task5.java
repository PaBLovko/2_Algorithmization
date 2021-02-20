package by.epam.tasks.univariate;

/*  Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class Task5 {
    public static void main(String[]args) {
        int N = 3;
        int[] A = new int[N];
        A[0] = 1;
        A[1] = 2;
        A[2] = 1;

        for (int i = 0; i < N; i++)
            if (A[i] > i) System.out.println(A[i]);
    }
}
