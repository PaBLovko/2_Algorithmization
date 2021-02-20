package by.epam.tasks.subroutines;

/*  Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9
* */

public class Task7 {

    public static void main(String[]args) {
        int[] numbers = {1, 3, 5, 7, 9};

        System.out.print(amountFactorial(numbers)+"\t");
    }

    private static int amountFactorial (int [] array) {
        int amount = 0;
        for (int element : array) {
            amount += factorial(element);
        }
        return amount;
    }
    private static int factorial (int n) {
        int result = 1;
        if (n == 1 || n == 0)
            return result;
        result = n * factorial(n - 1);
        return result;
    }

}
