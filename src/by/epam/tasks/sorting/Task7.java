package by.epam.tasks.sorting;

/*  Пусть даны две неубывающие последовательности действительных чисел a1 < a2 < ... < an и b1 < b2 < ... < bm.
    Требуется указать те места, на которые нужно вставлять элементы последовательности b1 < b2 < ... < bm в первую
    последовательность так, чтобы новая последовательность оставалась возрастающей.
*/

public class Task7 {

    public static void main(String[]args) {
        int[] A = {1, 6, 10, 11, 13, 15, 20};
        int[] B = {2, 2, 3, 5, 7, 10, 12};

        int minInd = 0;
        for (int j = 0; j < A.length; j++) {
            for (int i = minInd; i < A.length; i++) {
                if (B[i] < A[j]) {
                    minInd++;
                    System.out.print(j+" ");
                }
            }
        }

    }
}
