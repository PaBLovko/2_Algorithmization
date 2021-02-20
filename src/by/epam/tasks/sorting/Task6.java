package by.epam.tasks.sorting;

/*  Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
    Делается это следующим образом: сравниваются два соседних элемента ai и ai+1.
    Если ai < ai+1, то продвигаются на один элемент вперед.
    Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
    Составить алгоритм этой сортировки.
*/

public class Task6 {

    public static void main(String[]args) {
        int[] A = {10, 2, 3, 5, 7, 1, 2};

        int gap = A.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < A.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (A[c] > A[c + gap]) {
                        int tmp = A[c];
                        A[c] = A[c + gap];
                        A[c + gap] = tmp;
                    }
                }
            }
            gap = gap / 2;
        }

        for(int k : A)
            System.out.print(k+" ");
    }
}
