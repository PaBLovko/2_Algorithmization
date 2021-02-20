package by.epam.tasks.subroutines;

/*  Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
    если угол между сторонами длиной X и Y— прямой.
*/

public class Task9 {

    public static void main(String[]args) {
        int X = 3;
        int Y = 3;
        int Z = 3;
        int T = 3;

        System.out.print(getSquare(X, Y, Z, T)+"\t");
    }

    private static double getSquare(int x, int y, int z, int t) {
        double diagonal = Math.sqrt(x * x + y * y);
        double s1 = x * y / 2;
        double p = (diagonal + z + t) / 2;
        double s2 = Math.sqrt(p * (p - diagonal) * (p - z) * (p - t));
        return s1 + s2;
    }
}
