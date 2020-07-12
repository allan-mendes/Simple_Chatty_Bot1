import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);

        int elem = scan.nextInt();
        int sum = 0;
        for(int i = 1; i < elem + 1; i++){
            int number = scan.nextInt();
            sum += (number % 6 == 0) ? number : 0;
            }
        System.out.println(sum);
        }

    }