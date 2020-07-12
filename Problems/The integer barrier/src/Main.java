import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int input = 0;

        while (true) {
            input = scanner.nextInt();
            sum += input;
            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            } else if (input == 0) {
                break;
            }
        }
        System.out.println(sum);
    }
}