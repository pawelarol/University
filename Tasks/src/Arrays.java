import java.util.Scanner;

public class Arrays {
    private static boolean toString;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int startSecondA = scanner.nextInt();
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int size = array.length - startSecondA;
        int[] array1 = new int[size];
        for ( int i = startSecondA, j =0 ; i < array.length; i++, j++){
           array1[j] = array[i];
        }

        System.out.println(java.util.Arrays.toString(Arrays.toString(array)));
        System.out.println(java.util.Arrays.toString(Arrays.toString(array1)));
    }

    private static int[] toString(int[] array) {
        return array;
    }
}
