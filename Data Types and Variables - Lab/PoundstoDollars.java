import java.util.Scanner;

public class PoundstoDollars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pound=Double.parseDouble(sc.nextLine());
        double dolar=pound*1.31;
        System.out.printf("%.3f",dolar);

    }
}
