import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long[] arrFib=new long[60];
        int n=Integer.parseInt(sc.nextLine());
        arrFib[0]=1;
        arrFib[1]=1;
        for (int i = 2; i <n ; i++) {
            arrFib[i]=arrFib[i-1]+arrFib[i-2];

        }
        if (n==0){
            System.out.println(0);
        }else{
            System.out.println(arrFib[n-1]);
        }
    }
}
