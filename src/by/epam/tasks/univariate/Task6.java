package by.epam.tasks.univariate;

/*  Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
    являются простыми числами.
*/
public class Task6 {
    public static void main(String[]args) {
        int N = 6;
        double[] A = new double[N];
        A[0] = 100;
        A[1] = 1;
        A[2] = 2;
        A[3] = 3;
        A[4] = 4;
        A[5] = 5;

        double sum = 0;
        for (int i = 0; i < N; i++) {
            if(i==1 || i==2) sum += A[i];
            else {
                for (int j = 2; j < i; j++) {
                    if (A[i]%j==0) break;
                    if ((j == A[i]) || (j > Math.sqrt(A[i]))){
                        sum += A[i];
                        break;
                    }
                }
            }
        }

        System.out.println("sum of numbers " + sum);
    }
}