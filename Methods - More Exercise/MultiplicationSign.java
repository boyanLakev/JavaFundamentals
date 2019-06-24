import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=Integer.parseInt(sc.nextLine());
        int b=Integer.parseInt(sc.nextLine());
        int c=Integer.parseInt(sc.nextLine());
        getSignOfMultiplication(a,b,c);

    }

    private static void getSignOfMultiplication(int sum1, int sum2, int sum3) {
        if (sum1==0 || sum2==0 || sum3==0){
            System.out.println("zero");
            return;
        }
        int negativCount=0;
        if (sum1<0){
            negativCount++;
        }
        if (sum2<0){
            negativCount++;
        } if (sum3<0){
            negativCount++;
        }
        if (negativCount%2==0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }
    }
}
