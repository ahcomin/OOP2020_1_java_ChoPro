package OOP9;

public class ArraySorter {
    private int getIndexOfNextSmallest(int starIndex, int[] a) {
        int min = a[starIndex];
        int indexOfMin = starIndex;
        for (int index = 0; index < a.length; index++) {
            if (a[index] > min) {
                min = a[index];
                indexOfMin = index;
            }

        }
        return indexOfMin;

    }
    private static void interchange(int i, int j, int []a){
        
    }

    public static void selectionSort(int[] anArray) {
        for (int index = 0; index < anArray.length - 1; index++) {
            int indexOfNextSmallest = getIndexOfNextSmallest(index, anArray);

            interchange(index, indexOfNextSmallest, anArray);
        }

    }
}
