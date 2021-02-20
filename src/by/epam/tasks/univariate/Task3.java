package by.epam.tasks.univariate;

/*  Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
    положительных и нулевых элементов.
*/
public class Task3 {
    public static void main(String[]args){
        int N = 3;
        double[] A = new double[N];
        A[0] = 1.1;
        A[1] = 0;
        A[2] = 0;

        int minus = 0;
        int plus = 0;
        int zero = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > 0) {
                plus++;
            }else if (A[i] < 0){
                minus++;
            }else zero++;

        }
        System.out.println("minus "+minus+" plus "+plus+" zero "+zero);
    }
}
