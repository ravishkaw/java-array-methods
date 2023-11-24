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

        //Array length
        int arrayLength = myArray.length;

        //Print /Traverse Array
        PrintArray.printArray(myArray, arrayLength);

        //Insert @ beginning
        System.out.print("Enter a number to insert at begin : ");
        int beginNumber = scanner.nextInt();
        InsertBegin.InsertBeginning(myArray, arrayLength, beginNumber);

        //Insert @ Given Index
        System.out.print("Enter the Index : ");
        int givenIndex = scanner.nextInt();

        System.out.print("Enter the number");
        int givenNumber = scanner.nextInt();
        InsertIndex.insertIndex(myArray, arrayLength, givenIndex, givenNumber);

        //Linear Search
        System.out.print("Enter the key to find : ");
        int key = scanner.nextInt();
        int result = LinearSearch.search(myArray, arrayLength, key);

        if (result == -1){
            System.out.println("Key not found");
        }else {
            System.out.println("Key found at index : " + result);
        }

        scanner.close();
    }
}