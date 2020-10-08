package OOP9;

public class SelectionSortDemo {
    public static void display(int[] array, String when) {
        System.out.println("Array values " + when + " sorting:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] arg) {
        int[] b = {7, 5, 11, 2, 16, 4, 8, 14, 12, 30};
       // display(b, before);
        ArraySorter.selectionSort(b);
       // display(b, after);
    }
}
