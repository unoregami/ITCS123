//Ternary Search Algorithm w/ Unsorted data
import java.util.Scanner;
import java.util.Arrays;

public class TernarySearch {
    int steps = 0;  //counting steps per command

    public int ternarySearch(int[] array, int key, int l, int r) {
        int mid1 = l + (r - l) / 3;
        int mid2 = r - (r - l) / 3;
        steps++;

        //if key is found
        steps++;
        if (array[mid1] == key) {
            return mid1;
        }
        if (array[mid2] == key) {
            return mid2;
        }
        
        steps++;
        if (key < array[mid1]) {    //adjust the r to the mid1 section as the key is found there.
            r = mid1 - 1;
            return ternarySearch(array, key, l, r);
        } else if (key > array[mid2]) { //adjust the l to the mid2 section as the key is found there;
            l = mid2 + 1;
            return ternarySearch(array, key, l, r);
        }
        //if found in center
        l = mid1 + 1;
        r = mid2 - 1;
        return ternarySearch(array, key, l, r);
    }
    public void selectionSort(int[] array) {
        steps = 0;
        int n = array.length;
        int hold;
        for (int i = 0; i < (n-1); i++) {
            for (int j = i+1; j < n; j++) {
                if (array[i] > array[j]) {
                    hold = array[i];
                    array[i] = array[j];
                    array[j] = hold;
                }
                steps++;
            }
            steps++;
        }
    }
    
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        TernarySearch obj = new TernarySearch();
        String conf;
        do {
            Runtime rt = Runtime.getRuntime();
            long totMem = rt.totalMemory();
            obj.steps = 0;

            System.out.print("Length of array: ");
            int length = console.nextInt();
            int[] array = new int[length];

            //store random int in the array
            for (int i = 0; i < array.length; i++) {
                array[i] = (int)(Math.random() * 100) + 1;
                obj.steps++;
            }
            System.out.println("\nUnsorted array: " + Arrays.toString(array) + "\tSteps taken: " + obj.steps);

            //get key from the array
            int key = array[(int)(Math.random() * array.length)];
        
            obj.selectionSort(array);
            System.out.println("Sorted array: " + Arrays.toString(array) + "\tSteps taken: " + obj.steps);

            obj.steps = 0;
            int ret = obj.ternarySearch(array, key, 0, (array.length - 1));
            System.out.println("Key: " + key + "\tFound in position: " + ret + "\tSteps taken: " + obj.steps);

            rt = Runtime.getRuntime();
            long frMem = rt.freeMemory();
            System.out.println("Total Memory: " + totMem + "\nFree Memory: " + frMem + "\nUsed Memory: " + (totMem - frMem));

            System.out.print("\nTry again?: ");
            conf = console.next().toLowerCase();
        } while (conf.equals("yes"));
        console.close();
        
    }
}
