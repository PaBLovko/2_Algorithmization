package by.epam.tasks.subroutines;

/*  Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
    треугольника.
*/

public class Task3 {

    public static void main(String[]args) {
        int a = 7;

        System.out.print(getSquare(a)+"\t");
    }

    static double getSquare(int a) {
        return (3*Math.sqrt(3)*Math.pow(a,2)/2);
    }

}
