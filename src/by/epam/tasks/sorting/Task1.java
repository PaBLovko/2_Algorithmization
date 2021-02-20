package by.epam.tasks.sorting;

/*  Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
    один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
    дополнительный массив.
*/
import java.util.Arrays;

public class Task1 {
    public static void main(String[]args) {
        int N = 3;
        int M = 4;
        int[] A = new int[N];
        int[] B = new int[M];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        B[0] = 10;
        B[1] = 20;
        B[2] = 30;
        B[3] = 40;
        int K = 2;

        String ms = Arrays.toString(A);
        A = new int[N+M];
        System.arraycopy(B, 0, A, K, B.length);
        B = Arrays.stream(ms.substring(1, ms.length()-1).split(","))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < B.length; i++){
            if (i < K || i > K+M) A[i] = B[i];
            else A[i+M] = B[i];
        }
        for(int k : A)
            System.out.print(k+" ");
    }
}
