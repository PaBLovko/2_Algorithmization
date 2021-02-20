package by.epam.tasks.univariate;

/*  Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
    элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
*/

public class Task10 {
    public static void main(String[]args) {
        int N = 6;
        int[] A = new int[N];
        A[0] = -1;
        A[1] = 1;
        A[2] = 2;
        A[3] = 1;
        A[4] = 1;
        A[5] = 2;

        for (int i=0;i<A.length;i++) {
            if (i%2 != 0) A[i]=0;
        }

        for (int tmpEl : A)
            System.out.print(tmpEl + ", ");
    }
}