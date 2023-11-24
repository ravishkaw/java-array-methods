public class LinearSearch {
    public static int search(int[] myArray, int arrayLength, int key){

        for (int i= 0; i < arrayLength; i++){
            if (myArray[i] == key){
                return i;
            }
        }
        return -1;
    }
}
