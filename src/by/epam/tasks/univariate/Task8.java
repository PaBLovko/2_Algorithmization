package by.epam.tasks.univariate;

/*
        Rus 8. Дана последовательность целых чисел a 1 , a 2 , ... , a n . Образовать новую последовательность, выбросив из
        исходной те члены, которые равны min( a 1 , a 2 , ... , a n ) .
*/

public class Task8 {
    public static void main(String[]args) {
        int N = 6;
        int[] A = new int[N];
        A[0] = 0;
        A[1] = 1;
        A[2] = -2;
        A[3] = 3;
        A[4] = 4;
        A[5] = 5;

        int minVal = Integer.MAX_VALUE;
        for (int tmpEl : A) minVal = Math.min(minVal, tmpEl);
        int countMinElem = 0;
        for (int tmpEl : A) if (tmpEl == minVal) countMinElem++;
        int[] newA = new int[N - countMinElem];
        int indexNewArray = 0;
        for (int tmpEl : A)
            if (tmpEl != minVal) {
                newA[indexNewArray++] = tmpEl;
                System.out.print(tmpEl + ", ");
            }
    }
}