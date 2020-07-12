import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String new_string = "";

        for(int i = 0;i < input.length();i++){
            if(input.charAt(i) == 'a'){
                new_string = new_string + 'b';
            } else {
                new_string = new_string + input.charAt(i);
            }

        }
        System.out.println(new_string);


    }
}