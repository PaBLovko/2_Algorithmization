package by.epam.tasks.subroutines;

/*  Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
* */

public class Task11 {

    public static void main(String[]args) {
        int N = 312;
        int M = 1234;

        System.out.print(countDigitsCompare(N,M)+"\t");
    }

    private static int countDigitsCompare(int left, int right) {
        int leftCount = (int)(Math.log10(Math.abs(left))+1);
        int rightCount = (int)(Math.log10(Math.abs(right))+1);
        if (leftCount == rightCount) return 0;
        return (leftCount > rightCount) ? left : right;
    }
}
