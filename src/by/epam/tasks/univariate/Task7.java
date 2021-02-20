package by.epam.tasks.univariate;

/* Даны действительные числа a1, a2,..., an. Найти max(a1+a2n, a2+a2n-1,..., an+an+1)
*/
public class Task7 {
    public static void main(String[]args) {
        int N = 6;
        double[] A = new double[N];
        A[0] = -1;
        A[1] = 1;
        A[2] = 2;
        A[3] = 3;
        A[4] = 4;
        A[5] = 5;

        double maxSum = A[0] + A[A.length - 1];
        for(int i = 1; i < A.length / 2; i++){
            if((A[i] + A[A.length - i - 1]) > maxSum){
                maxSum = A[i] + A[A.length - i - 1];
            }
        }

        System.out.println("sum of numbers " + maxSum);
    }
}