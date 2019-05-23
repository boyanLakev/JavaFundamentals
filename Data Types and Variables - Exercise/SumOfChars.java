import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=Integer.parseInt(sc.nextLine());
        int sum=0;
        for (int i = 0; i <count ; i++) {
            char ch=sc.nextLine().charAt(0);
            sum+=(int)ch;
        }
        System.out.printf("The sum equals: %d",sum);
    }

}
