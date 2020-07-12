import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        // write your code here
        boolean x = false;
        long count = number - 1;
        while (count > 1) {
            if (number % count == 0 ) {
                x = true;
                break;
            }
            count--;
        }
        return x;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}