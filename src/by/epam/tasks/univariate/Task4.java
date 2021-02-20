package by.epam.tasks.univariate;

/*  Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
* */
public class Task4 {
    public static void main(String[]args){
        int N = 3;
        double[] A = new double[N];
        A[0] = 1.1;
        A[1] = 2.2;
        A[2] = 1.3;

        for (int i=0; i<N;i++) System.out.println(A[i]);
        System.out.println();

        double max = A[0];
        int indexMax = 0;
        double min = A[0];
        int indexMin = 0;
        for (int i = 1; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
                indexMax = i;
            }
            if (A[i] < min){
                min = A[i];
                indexMin = i;
            }
        }
        A[indexMax] = min;
        A[indexMin] = max;

        for (int i=0; i<N;i++) System.out.println(A[i]);
    }
}
