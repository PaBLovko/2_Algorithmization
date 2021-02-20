package by.epam.tasks.subroutines;

/* Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
* */

public class Task2 {

    public static void main(String[]args) {
        int a = 2;
        int b = 4;
        int c = 4;
        int d = 4;


        System.out.print((findGcd(findGcd(a,b), findGcd(c,d)))+"\t");
    }

    static int findGcd(int a, int b) {
        return b == 0 ? a : findGcd(b, a % b);
    }
}
