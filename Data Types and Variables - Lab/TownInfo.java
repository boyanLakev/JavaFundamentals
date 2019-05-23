
import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String town=sc.nextLine();
        long populate=Long.parseLong(sc.nextLine());
        int area=Integer.parseInt(sc.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.",town,populate,area);
    }
}
