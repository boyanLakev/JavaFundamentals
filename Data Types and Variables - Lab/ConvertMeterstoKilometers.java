import java.util.Scanner;

public class ConvertMeterstoKilometers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double meters=Double.parseDouble(sc.nextLine());
        double kilometers=meters/1000;
        System.out.printf("%.2f",kilometers);

    }
}
