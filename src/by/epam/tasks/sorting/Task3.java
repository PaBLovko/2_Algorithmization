package by.epam.tasks.sorting;

/*  Сортировка выбором. Дана последовательность чисел a1 < a2 <...< an.Требуется переставить элементы так,
    чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
    элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
    повторяется. Написать алгоритм сортировки выбором.
*/

public class Task3 {

    public static void main(String[]args) {
        int[] A = {10, 2, 3, 5, 7, 1, 2};

        for (int left = 0; left < A.length; left++) {
            int minInd = left;
            for (int i = left; i < A.length; i++) {
                if (A[i] < A[minInd]) {
                    minInd = i;
                }
            }
            int tmp = A[left];
            A[left] = A[minInd];
            A[minInd] = tmp;
        }

        for(int k : A)
            System.out.print(k+" ");
    }
}
