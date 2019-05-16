import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum=0;
        int num=number;
        while (num!=0){
            int factoriel;
            int n=num%10;
            if (n==0){
                factoriel=1;
            }else{
                factoriel=1;
                for (int i=1;i<=n;i++){
                    factoriel*=i;
                }

            }

            sum+=factoriel;
            num/=10;

        }
        if (sum==number){
            System.out.println("yes");

        }else {
            System.out.println("no");
        }
    }
}
