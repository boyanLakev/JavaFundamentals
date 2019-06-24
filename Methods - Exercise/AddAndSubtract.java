import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int d=Integer.parseInt(scanner.nextLine());
        int total = sum(a, b, d);
        System.out.println(total);

    }

    private static int sum(int a, int b, int d) {
        int sum=(a+b)-d;
        return sum;
    }
}
