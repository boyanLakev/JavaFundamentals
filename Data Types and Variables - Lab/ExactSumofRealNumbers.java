import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumofRealNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cout=Integer.parseInt(sc.nextLine());
        BigDecimal total=new BigDecimal("0");
        while(cout-->0){
        BigDecimal add=new BigDecimal(sc.nextLine());
        total=total.add(add);
        }
        System.out.println(total);
    }
}
