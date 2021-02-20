package by.epam.tasks.subroutines;

/*  Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
    массива с номерами от k до m
*/
public class Task8 {

    public static void main(String[]args) {
        int[] numbers = {1, 3, 5, 7, 9, 12};

        System.out.print(summation(numbers, 1)+"\t");
        System.out.print(summation(numbers, 3)+"\t");
        System.out.print(summation(numbers, 4)+"\t");
    }

    private static int summation(int[] array, int k) {
        int sum = 0;
        for (int i = k - 1; i < k + 2; i++)
            sum += array[i];
        return sum;
    }
}
