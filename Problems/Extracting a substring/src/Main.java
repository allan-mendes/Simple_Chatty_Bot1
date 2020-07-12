import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

//        String first = scanner.nextLine();
//
//        int ind_1 = scanner.nextInt();
//        int ind_2 = scanner.nextInt();
//
//        String subs = "";
//
//        for(int i = ind_1; i <= ind_2; i++){
//            subs = subs + first.charAt(i);
//        }
//        System.out.println(subs);

        System.out.println(scanner.next().substring(scanner.nextInt(), scanner.nextInt()+1));
    }
}