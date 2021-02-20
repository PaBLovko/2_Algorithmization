package by.epam.tasks.subroutines;

/*  Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
    действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
*/

public class Task17 {

    public static void main(String[]args) {
        int N = 66;
        System.out.println(countSubtraction(N));
    }
    private static int countSubtraction(int number) {
        int count = 0;
        while (number > 0) {
            number -= countSumOfDigits(number);
            count++;
        }
        return count;
    }

    private static int countSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
