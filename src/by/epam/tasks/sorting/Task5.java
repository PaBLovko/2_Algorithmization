package by.epam.tasks.sorting;

/*  Сортировка вставками. Дана последовательность чисел a1 ,a2 , ... ,an.
    Требуется переставить числа в порядке возрастания. Делается это следующим образом.
    Пусть a1, a2, ..., ai - упорядоченная последовательность, т. е. a1 < a2 <...< an.
    Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
    последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
    не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
    с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
*/
public class Task5 {

    private static int binarySearch(int[] array, int lastIndex, int element) {
        int j = lastIndex;
        int firstIndex = 0;
        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (array[j] == element) {
                return j;
            } else if (array[j] < element) {
                firstIndex = j + 1;
            } else if (array[j] > element && j != 0 && !(array[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }

    public static void main(String[]args) {
        int[] A = {10, 2, 3, 5, 7, 1, 2};

        int temp;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                temp = A[i + 1];
                int j = binarySearch(A, i, A[i + 1]);
                if (i + 1 - j >= 0) System.arraycopy(A, j, A, j + 1, i + 1 - j);
                A[j] = temp;
            }
        }

        for(int k : A)
            System.out.print(k+" ");
    }
}
