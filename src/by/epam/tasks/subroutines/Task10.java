package by.epam.tasks.subroutines;

/*  Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
    являются цифры числа N.
*/

public class Task10 {

    public static void main(String[]args) {
        int N = 312;
        int[] array = new int[3];

        getArray(array, N);
        for (int k : array)
            System.out.print(k+"\t");
    }

    private static int[] getArray(int[] array, int n) {
        for(int i = array.length - 1; i >= 0; -- i){
            array[i] = n%10;
            n /= 10;
        }
        return array;
    }
}
