public class InsertIndex {
    static void insertIndex(int[] myArray, int arrayLength, int givenIndex, int givenNumber){

        for (int i = arrayLength -1; i>givenIndex; i--){
            myArray[i] = myArray[i-1];
        }
        myArray[givenIndex] = givenNumber;

        for (int j:myArray) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }
}
