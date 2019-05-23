import java.util.Scanner;

public class M1SignOfInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=Integer.parseInt(sc.nextLine());
        SingOfInteger(number);
    }

    private static void SingOfInteger(int number) {
        if (number>0){
            System.out.printf("The number %d is positive.",number);
        }else if(number<0){
            System.out.printf("The number %d is negative.",number);
        }else{
            System.out.println("The number 0 is zero.");
        }
    }
}
