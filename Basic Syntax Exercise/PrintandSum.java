import java.util.Scanner;

public class PrintandSum {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int starNumber=Integer.parseInt(scanner.nextLine());
        int endNumber=Integer.parseInt(scanner.nextLine());
        int sum=0;
        for(int i=starNumber;i<=endNumber;i++){
            sum+=i;
            System.out.printf("%d ",i);
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);

    }
}
