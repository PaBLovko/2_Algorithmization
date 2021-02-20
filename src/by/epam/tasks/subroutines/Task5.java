package by.epam.tasks.subroutines;

/*  Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
    которое меньше максимального элемента массива, но больше всех других элементов).
*/

public class Task5 {

    public static void main(String[]args) {
        int[] A = {10, 2, 3, 5, 7, 1, 2};

        System.out.print(findSecondMaxNumber(A)+"\t");
    }

    static int findSecondMaxNumber(int[] array) {
        for (int i=0; i<array.length;i++) {
            for (int j = 0; j < i; j++) {
                if(array[i] < array[j]) {
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
        return array[array.length - 2];
    }
}
