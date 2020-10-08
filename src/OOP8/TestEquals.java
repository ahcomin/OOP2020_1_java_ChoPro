package OOP8;

public class TestEquals {
    public static void setArray (int [] array){
        for (int i = 0; i< array.length; i++){
            array [i] = i;
        }
    }
    public static boolean equals(int [] arr1, int[] arr2){
       if(arr1.length != arr2.length)
           return false;
       int i = 0;
       while (i < arr1.length){
           if(arr1[i] != arr2[i])
               return false;
           i++;
       }
       return true;

    }
    public static void main(String[] args) {
        int [] a = new int[3];
        int [] b = new int [3];

        setArray(a);
        setArray(b);
        if(b==a)
            System.out.println("Equal by ==.");
        else
            System.out.println("Not equal by ==.");

        if (equals(b,a))
            System.out.println("Equal by the equals method.");
        else
            System.out.println("Not equal by the equals method.");
    }
}
