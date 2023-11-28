import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Initialize array
        int[] myArray = new int[10];
        myArray[0] = 5;
        myArray[1] = 45;
        myArray[2] = 7;
        myArray[3] = 19;
        myArray[4] = 8;
        myArray[5] = 62;
        myArray[6] = 13;
        myArray[7] = 54;

        //Array length
        int arrayLength = myArray.length;

        //Print /Traverse Array
        System.out.print("Print Array : ");
        PrintArray.printArray(myArray, arrayLength);

        System.out.println("Insertion at the beginning");
        //Insert @ beginning
        System.out.print("Enter a number to insert at begin : ");
        int beginNumber = scanner.nextInt();
        System.out.print("New Array : ");
        InsertBegin.InsertBeginning(myArray, arrayLength, beginNumber);

        System.out.println("Insertion at given index");
        //Insert @ Given Index
        System.out.print("Enter the Index : ");
        int givenIndex = scanner.nextInt();

        System.out.print("Enter the number : ");
        int givenNumber = scanner.nextInt();

        System.out.print("New Array : ");
        InsertIndex.insertIndex(myArray, arrayLength, givenIndex, givenNumber);

        System.out.println("Linear Search ");
        //Linear Search
        System.out.print("Enter the key to find : ");
        int key = scanner.nextInt();
        int result = LinearSearch.search(myArray, arrayLength, key);

        if (result == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index : " + result);
        }

        System.out.println("Binary Search ");
        //Binary Search
        int top = 0;
        int bottom = arrayLength -1;
        System.out.print("Enter the key to find : ");
        int keyBinarySearch = scanner.nextInt();
        BinarySearch.binarySearch(myArray, top, bottom, keyBinarySearch);

        scanner.close();
    }
}