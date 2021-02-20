package by.epam.tasks.univariate;

/*  Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
    числом. Подсчитать количество замен.
*/
public class Task2 {
    public static void main(String[]args){
        int N = 3;
        double[] A = new double[N];
        A[0] = 1.1;
        A[1] = 2.2;
        A[2] = 3.3;
        int Z = 2;

        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > Z) {
                A[i] = Z;
                sum++;
            }
        }
        System.out.println("number of substitutions "+sum);
    }
}
