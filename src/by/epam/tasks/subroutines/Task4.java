package by.epam.tasks.subroutines;

/*  На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
    из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
*/

public class Task4 {

    public static void main(String[]args) {
        int[] points = {10, 2, 3, 5, 7, 1, 2};

        int[] result = getDistance(points);
        for (int k: result)
            System.out.print(k+"\t");
    }

    static int[] getDistance(int[] a) {
        int max = 0;
        int indexFirst = 0;
        int indexSecond = 0;
        for (int value : a) {
            for (int i : a) {
                if (Math.abs(value - i) > max) {
                    max = Math.abs(value - i);
                    indexFirst = value;
                    indexSecond = i;
                }
            }
        }
        int[] result = new int[2];
        result[0]=indexFirst;
        result[1]=indexSecond;
        return result;
    }
}
