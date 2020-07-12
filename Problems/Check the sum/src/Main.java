import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean a_b = a + b == 20;
        boolean a_c = a + c == 20;
        boolean b_c = b + c == 20;

        System.out.println((a_b || a_c) || b_c);
    }
}