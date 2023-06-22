//THE INFAMOUS BOGOSORT
import java.util.Arrays;
import java.util.Scanner;

public class BogoSort {
    static int a, b;
    static int[] array;
    static int step = 0;

    public static boolean isSorted() {
        for (int i = 0; i < (a-1); i++) {
            if (array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void bogoSort() /*throws InterruptedException*/ {
        step++;
        int hold;
        for (int i = 0; i < a; i++) {
            int x = (int)(Math.random() * a);
            hold = array[i];
            array[i] = array[x];
            array[x] = hold;
        }
        System.out.println(step + ". " + Arrays.toString(array));
        //Thread.sleep(1000);
    }
    public static void main(String[] args) /*throws InterruptedException*/ {
        Scanner console = new Scanner(System.in);
        System.out.print("Length: ");
        a = console.nextInt();
        System.out.print("Max: ");
        b = console.nextInt();

        array = new int[0];
        for (int i = 1; i <= a; i++) {
            int rand = (int)(Math.random() * (b+1));
            array = Arrays.copyOf(array, i);
            array[i-1] = rand;
        }
        System.out.println(step + ". " + Arrays.toString(array));
        //Thread.sleep(1000);

        boolean sort = isSorted();
        while(sort == false) {
            bogoSort();
            sort = isSorted();
        }
    }
}