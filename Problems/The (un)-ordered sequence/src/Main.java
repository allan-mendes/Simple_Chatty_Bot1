import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int new_input = scanner.nextInt();

        String a = "true";

        if (input > new_input) {
            while (new_input != 0) {
                input = new_input;
                new_input = scanner.nextInt();

                if (input < new_input) {
                    a = "false";
                    break;
                }
                a = "true";
            }
        } else {
            while (new_input != 0) {
                input = new_input;
                new_input = scanner.nextInt();

                if (input > new_input && new_input != 0) {
                    a = "false";
                    break;
                }
                a = "true";
            }
        }
        System.out.println(a);
    }
}