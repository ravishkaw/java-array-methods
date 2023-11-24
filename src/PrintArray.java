public class PrintArray {

    public static void printArray(int[] myArray, int arrayLength) {
        for (int i = 0; i < arrayLength - 1; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\n");
    }
}
