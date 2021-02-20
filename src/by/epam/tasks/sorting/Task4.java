package by.epam.tasks.sorting;

/*  Сортировка обменами. Дана последовательность чисел a1 < a2 <...< an.
    Требуется переставить числа в порядке возрастания.
    Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1, то делается
    перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
    Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
*/
public class Task4 {

    public static void main(String[]args) {
        int[] A = {10, 2, 3, 5, 7, 1, 2};

        int count = 0;
        for (int j = 0; j < A.length; j++){
            for (int i = 1; i < A.length; i++) {
                if (A[i] < A[i - 1]) {
                    int tmp = A[i];
                    A[i] = A[i-1];
                    A[i-1] = tmp;
                    count++;
                }
            }
        }


        for(int k : A)
            System.out.print(k+" ");
        System.out.println();
        System.out.println(count+" ");

    }
}
