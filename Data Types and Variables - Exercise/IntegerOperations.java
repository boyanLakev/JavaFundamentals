import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstNum=Integer.parseInt(sc.nextLine());
        int secondNum=Integer.parseInt(sc.nextLine());
        int threeNum=Integer.parseInt(sc.nextLine());
        int fourNum=Integer.parseInt(sc.nextLine());
        long result=((firstNum+secondNum)/threeNum)*fourNum;
        System.out.println(result);
    }
}
