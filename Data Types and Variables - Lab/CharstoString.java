import java.util.Scanner;

public class CharstoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char first=sc.nextLine().charAt(0);
        char second=sc.nextLine().charAt(0);
        char third=sc.nextLine().charAt(0);
        String result=""+first+second+third;
        System.out.println(result);
    }
}
