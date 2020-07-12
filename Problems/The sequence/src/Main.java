import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int count1 = 1;
        int count2 = 1;
        int count3 = 0;
        String answer = "";
        boolean out = false;

        while (count1 <= input) {
            while (count2 <= count1) {
                answer += count1 + " ";
                count2++;
                count3++;
                if (count3 == input) {
                    out = true;
                    break;
                }
            }
                count1++;
                count2 = 1;
                if (out) {
                    break;
                }
            }
            System.out.println(answer);
        }
    }