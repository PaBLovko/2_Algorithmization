package by.epam.tasks.subroutines;

/*  Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
* */

public class Task6 {

    public static void main(String[]args) {
        int[] numbers = {10, 12, 13};

        System.out.print(isPrimeNumber(numbers[0], numbers[1], numbers[2])+"\t");
    }

    static boolean isPrimeNumber(int a, int b, int c) {
        return findGcd(a,b,c) == 1;
    }

    static int findGcd(int a, int b, int c) {
        return findGcd(findGcd(a,b),c);
    }

    static int findGcd(int a, int b) {
        return b == 0 ? a : findGcd(b, a % b);
    }

}
