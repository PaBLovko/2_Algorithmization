package by.epam.tasks.subroutines;

/*  Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
    являются числа, сумма цифр которых равна К и которые не большее N.
*/

public class Task12 {

    public static void main(String[]args) {
        int K = 312;
        int N = 1234;
//
        int[] array = createArray(K, N);
        for (int k : array)
            System.out.print(k+"\t");
    }

    private static int[] createArray (int k, int n) {
        int [] array = new int[k];
        int i;
        for (i = 0; i < array.length && k > n; i++) {
            array[i] = (int) (Math.random() * n) + 1;
            k -= array[i];
        }
        array[i] = k;
        int [] arrayA = new int[i + 1];
        System.arraycopy(array, 0, arrayA, 0, i + 1);
        return arrayA;

    }
}
