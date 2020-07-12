import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int input = 1;
        while (input != 0) {
            input = scanner.nextInt();
            max = max > input ? max : input;
        }
        System.out.println(max);
    }
}
