import java.util.Arrays;

public class LinearAndBinarySearch {
    public static int linearSearch(int element, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int element, int[] array, int low, int high) {
        

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == element) {
                return mid;
            }

            if (array[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int result;
        int x = 6;
        int[] list = {5, 1, 3, 4, 6, 2};

        System.out.println("Linear Search\nElement: " + x + "\nArray: " + Arrays.toString(list));
        result = linearSearch(x, list);
        if (result == -1) {
            System.out.println("Element is not found in the array");
        } else {
            System.out.println("Element " + x + " is found in position " + result);
        }
        System.out.println();

        x = 11;
        int[] list1 = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println("Binary Search\nElement: " + x + "\nArray: " + Arrays.toString(list1));
        result = binarySearch(x, list1, 0, (list1.length - 1));
        if (result == -1) {
            System.out.println("Element is not found in the array");
        } else {
            System.out.println("Element " + x + " is found in position " + result);
        }
    }
}
