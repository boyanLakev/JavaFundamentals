import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        String concatSymbol=sc.nextLine();

        String total=firstName+concatSymbol+lastName;
        System.out.println(total);
    }
}
