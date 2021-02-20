package by.epam.tasks.subroutines;

/*  Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
    натуральных чисел:
*/

public class Task1 {

    public static void main(String[]args) {
        int A = 2;
        int B = 4;

        System.out.print(findNoc(A,B)+"\t");
    }

    static int findGcd(int a,int b) {
        return b == 0 ? a : findGcd(b, a % b);
    }

    static int findNoc(int x, int y) {
        return x * y / findGcd(x, y);
    }
}
