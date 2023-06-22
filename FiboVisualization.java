/* Fibonacci Visulization (Maximum length: 47, see line 12)
 * Inspired by: https://www.youtube.com/watch?v=o1eLKODSCqw
*/
import java.util.Scanner;
import java.util.Arrays;

public class FiboVisualization {
    static int[] fibo;
    static int[] fibomod;
    static char[] directions;

    /* find way to use negative integer after max limit of int to print the corresponding fibonacci values after index 46. Convert values to String to print. */
    
    public static void getFibonacci(int length, int a, int b) {
        FiboVisualization.fibo = new int[length];
        FiboVisualization.fibo[0] = a;
        FiboVisualization.fibo[1] = b;
        for (int i = 2; i < length; i++) {
            FiboVisualization.fibo[i] = FiboVisualization.fibo[i-2] + FiboVisualization.fibo[i-1];
        }
    }
    public static void getModulo(int length, int mod) {
        FiboVisualization.fibomod = new int[length];
        for (int i = 0; i < length; i++) {
            FiboVisualization.fibomod[i] = (FiboVisualization.fibo[i] % mod);
        }
    }
    public static void writeDirection(int length) {
        //0 - Straight | odd - Left | even - Right
        FiboVisualization.directions = new char[length];
        for (int i = 0; i < length; i++) {
            if (FiboVisualization.fibomod[i] == 0) {
                FiboVisualization.directions[i] = 'S';
            } else if (FiboVisualization.fibomod[i] % 2 == 0) {
                FiboVisualization.directions[i] = 'R';
            } else {
                FiboVisualization.directions[i] = 'L';
            }
        }
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (0 == 0) {
            try {
                System.out.print("Length: ");
                int length = console.nextInt();
                System.out.print("A: ");
                int a = console.nextInt();
                System.out.print("B: ");
                int b = console.nextInt();
                
                //get fibonacci
                getFibonacci(length, a, b);

                //get modulo
                System.out.print("Modulus: ");
                int mod = console.nextInt();
                getModulo(length, mod);

                //directions
                writeDirection(length);

                System.out.println(Arrays.toString(FiboVisualization.fibo));
                System.out.println(Arrays.toString(FiboVisualization.fibomod));
                System.out.println(Arrays.toString(FiboVisualization.directions));
            } catch (Exception e){
                System.exit(0);
            }
        }
    }
}
