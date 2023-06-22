import java.util.Arrays;

public class SelectionAndConvergingSort {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[i]) {
                    int stock = array[i];
                    array[i] = array[j];
                    array[j] = stock;
                }
            }
        }
    }

    public static void mySelectionSort(int[] array) {
        int n = array.length;
        int currentR = n - 1, nextR = currentR - 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= currentR; j++) {
                if (array[j] < array[i]) {
                    int stock = array[i];
                    array[i] = array[j];
                    array[j] = stock;
                }
                if (j + 1 >= n) {
                    break;
                }

                if (array[nextR] > array[currentR]) {
                    int stock = array[currentR];
                    array[currentR] = array[nextR];
                    array[nextR] = stock;
                }
                nextR--;
            }
            currentR--;
            nextR = currentR - 1;
            n--;
        }
    }
    public static void main(String[] args) {
        int timeList = 0;
        System.out.println("Selection Sort\n\n");
        for (int j = 0; j < 10; j++){
            long startTime = System.nanoTime();
            int[] sample = new int[10];
            for (int i = 0; i < sample.length; i++) {
                sample[i] = (int)(Math.random() * 100);
            }
            System.out.println("Before: " + Arrays.toString(sample));
            
            selectionSort(sample);

            System.out.println("After: " + Arrays.toString(sample));

            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("Time: " + elapsedTime/100000 + "\n");
            timeList += elapsedTime/100000;
        }
        
        long averageTime = timeList / 10;

        System.out.println("Average Time: " + averageTime);
        System.out.println("----------------------------------------------------------------------");

        //my selection sort
        timeList = 0;
        System.out.println("Converging Sort\n\n");
        for (int j = 0; j < 10; j++){
            long startTime = System.nanoTime();
            int[] sample = new int[10];
            for (int i = 0; i < sample.length; i++) {
                sample[i] = (int)(Math.random() * 100);
            }
            System.out.println("Before: " + Arrays.toString(sample));
            
            mySelectionSort(sample);

            System.out.println("After: " + Arrays.toString(sample));

            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("Time: " + elapsedTime/100000 + "\n");
            timeList += elapsedTime/100000;
        }
        
        averageTime = timeList / 10;
        System.out.println("Average Time: " + averageTime);
    }
}