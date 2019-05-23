import java.util.Scanner;

public class LowerorUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char first=sc.nextLine().charAt(0);
        int f =first;

        if (f>=97){
            System.out.println("lower-case");
        }else{
            System.out.println("upper-case");

        }


    }
}
