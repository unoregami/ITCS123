//Ascending Random Number Generator w/ FIRST TIME USING THREAD
import java.util.Scanner;
import java.util.Arrays;

public class AscendingRandomGenerator {
    static String conf;
    public static void main(String[] args) throws InterruptedException {
        Scanner console = new Scanner(System.in);
        
        do {
            System.out.println("Ascending Number Generator");
            Thread.sleep(2000);
            System.out.print("Length: ");
            int length = console.nextInt();
            System.out.print("Max num: ");
            int num = console.nextInt();

            int[] array = new int[length];
            for (int i = 0; i < length; i++) {
                int n = (int)(Math.random() * num) + 1;
                
                if (i == 0) {
                    while (n > (0.1 * num)) {
                        n = (int)(Math.random() * num) + 1;
                    }
                    array[i] = n;
                    continue;
                }
                while (array[i-1] + ((Math.random() / 2) * (0.1 * num) + 1) < n || array[i-1] >= n) {
                    n = (int)(Math.random() * num) + 1;
                }
                if (n > num) {
                    break;
                }
                array[i] = n;
            }
            System.out.println(Arrays.toString(array));
            
            System.out.println("Repeat?");
            conf = console.next();
        } while (conf.equals("yes"));
    }
}
