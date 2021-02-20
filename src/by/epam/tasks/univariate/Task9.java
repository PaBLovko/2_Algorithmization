package by.epam.tasks.univariate;

/*  В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
    чисел несколько, то определить наименьшее из них.
*/
public class Task9 {
    public static void main(String[]args) {
        int N = 6;
        int[] A = new int[N];
        A[0] = 0;
        A[1] = 1;
        A[2] = 2;
        A[3] = 1;
        A[4] = 1;
        A[5] = 2;

        int indexMin=0;
        int[] countFrequency = new int[N];
        for (int i=0;i<A.length;i++) {
            for (int j=i+1;j<A.length;j++) if (A[i] == A[j]) countFrequency[i]++;
            if (countFrequency[i]==countFrequency[indexMin])
                indexMin=A[indexMin]>A[i]?i:indexMin;
            else indexMin=countFrequency[i]>countFrequency[indexMin]?i:indexMin;
        }

        System.out.print(A[indexMin]);
    }
}