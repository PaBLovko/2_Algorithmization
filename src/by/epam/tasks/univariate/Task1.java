package by.epam.tasks.univariate;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task1 {
    public static void main(String[]args){
        int N = 3;
        int[] A = new int[N];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        int K = 2;

        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] % K == 0) {
                sum+=A[i];
            }
        }
        System.out.println("sum of multiples "+sum);
    }
}
