import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int[] tribonacciSequence= new int[n];
        tribonacciSequence[0]=1;
        if(n>1){
            tribonacciSequence[1]=1;
        }
        if(n>2){
            tribonacciSequence[2]=2;
        }
        for (int i = 3; i <n ; i++) {
            tribonacciSequence[i]=tribonacciSequence[i-1]+tribonacciSequence[i-2]+tribonacciSequence[i-3];

        }
        //
        for (int index:
             tribonacciSequence) {
            System.out.print(index+" ");
        }
        System.out.println();
    }
}
