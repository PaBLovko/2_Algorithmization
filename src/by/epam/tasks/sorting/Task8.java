package by.epam.tasks.sorting;

/*  Даны дроби (p1/q1, p2/q2, ... , pn/qn) (pi, qi - натуральные).
    Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
*/

public class Task8 {

    public static void main(String[]args) {
        Fraction [] array = {new Fraction(1, 3), new Fraction(2, 4),
                new Fraction(7, 12),new Fraction(5, 12), new Fraction(12, 3)};

        int number = array[0].divisor;
        for (int i = 1; i < array.length; i++){
            number = NOK(number, array[i].divisor);
        }

        for (Fraction fraction : array) {
            int multiplier = number / fraction.divisor;
            fraction.divisor *= multiplier;
            fraction.divisible *= multiplier;
        }

        for (int j = 0; j < array.length; j++){
            for (int i = 1; i < array.length; i++) {
                if (array[i].divisible < array[i - 1].divisible) {
                    Fraction tmp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = tmp;
                }
            }
        }

        for (Fraction fraction : array)
            System.out.print(fraction.divisible+"\t");
        System.out.println();
        for (Fraction fraction : array)
            System.out.print(fraction.divisor+"\t");
    }

    static class Fraction {
        int divisible;
        int divisor;

        Fraction(int divisible, int divisor) {
            this.divisible = divisible;
            this.divisor = divisor;
        }
    }

    static int NOD(int a,int b) {
        return b == 0 ? a : NOD(b, a % b);
    }

    static int NOK(int x, int y) {
        return x * y / NOD(x, y);
    }
}
