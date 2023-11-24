public class InsertBegin {
    public static void InsertBeginning(int[] myArray,int arrayLength, int beginNumber) {

        for (int i = arrayLength - 1; i > 0; i--) {
            myArray[i] = myArray[i - 1];
        }
        myArray[0] = beginNumber;

        for (int j : myArray) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }
}
