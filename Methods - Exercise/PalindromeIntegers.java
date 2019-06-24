import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input=scanner.nextLine();
        while (!input.equalsIgnoreCase("end")){

            boolean palindrom=true;
            for (int i = 0; i <input.length()/2 ; i++) {
                char left=input.charAt(i);
                char right=input.charAt(input.length()-i-1);
                if (left!=right){
                    palindrom=false;
                    break;
                }

            }
            System.out.println(palindrom);
            input=scanner.nextLine();
        }
    }
}
