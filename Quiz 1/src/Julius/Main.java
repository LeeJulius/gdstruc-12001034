package Julius;

public class Main {

    public static void main(String[] args) {
        //Create new array
        int[] numbers = new int[10];

        //Fill up array
        numbers[0] = 2;
        numbers[1] = 20;
        numbers[2] = 45;
        numbers[3] = -8;
        numbers[4] = 42;
        numbers[5] = 34;
        numbers[6] = 79;
        numbers[7] = 354;
        numbers[8] = 69;
        numbers[9] = -10;

        //Initial Array
        System.out.print("Original Array: ");
        printArrayElement(numbers);

        //After Bubble Sort
        bubbleSort(numbers);
        System.out.print("\nBubble Sorted Array: ");
        printArrayElement(numbers);

        //After Select Sort
        selectSort(numbers);
        System.out.print("\nSelect Sorted Array: ");
        printArrayElement(numbers);
    }

    //Bubble Sort Function
    private static void bubbleSort(int[]array) {
        for (int lastSortedIndex = array.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            for (int i = 0; i < lastSortedIndex; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    //SelectSort Function
    private static void selectSort(int[]array) {
        for (int lastSortedIndex = array.length - 1; lastSortedIndex > 0; lastSortedIndex--) {

            int smallestIndex = 0;

            for (int i = 0; i <= lastSortedIndex; i++) {
                if (array[i] < array[smallestIndex]) {
                    smallestIndex = i;
                }
            }

            int temp = array[lastSortedIndex];
            array[lastSortedIndex] = array[smallestIndex];
            array[smallestIndex] = temp;
        }
    }

    private static void printArrayElement(int[]array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

