import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        String  revString=scanner.nextLine();
        String result="";
        for(int i=0;i<revString.length();i++){
            char symbol=revString.charAt(i);
            result=""+ symbol+result;

        }
        System.out.println(result);

    }
}
