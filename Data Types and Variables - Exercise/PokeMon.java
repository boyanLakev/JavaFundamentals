import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int m=Integer.parseInt(sc.nextLine());
        int y=Integer.parseInt(sc.nextLine());
        int target=0;
        double halfN=n/2.0;
        while (n>=m){
            target++;
            n-=m;

                if ( n==halfN && y>0){
                    n /= y;

                }

        }
        System.out.println(n);
        System.out.println(target);





    }
}
