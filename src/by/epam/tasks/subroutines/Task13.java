package by.epam.tasks.subroutines;

/*  Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
    Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
    решения задачи использовать декомпозицию.
*/

public class Task13 {

    public static void main(String[]args) {
        int N = 10;
        int[] array = createArray(N);
        printMatrix(array);
        printMatrix(findTwin(array));
    }

    private static int[] createArray(int n){
        int[] twinNumbers = new int[n - 1];
        for (int i = 0; i < twinNumbers.length; i++)
            twinNumbers[i] = n + i;
        return  twinNumbers;
    }

    private static int[] findTwin(int[] twinNumbers) {
        for (int i = 0; i < twinNumbers.length; i++) {
            twinNumbers[i] = twinNumbers[i] + 2;
        }
        return twinNumbers;
    }

    private static void printMatrix(int[] square) {
        for (int element : square) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
