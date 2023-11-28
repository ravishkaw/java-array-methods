public class BinarySearch {

    public static void binarySearch(int[] array, int top, int bottom, int key) {
        int mid = (top + bottom) / 2;

        while (top <= bottom) {
            if (array[mid] > key) {
                bottom = mid - 1;
            } else if (array[mid] == key) {
                System.out.println("Key found at " + mid);
                break;
            } else if (array[mid] < key) {
                top = mid + 1;
            }

            mid = (top + bottom) / 2;
        }
    }

}
