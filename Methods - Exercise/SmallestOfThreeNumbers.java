import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =Integer.parseInt(sc.nextLine());
        int b =Integer.parseInt(sc.nextLine());
        int c =Integer.parseInt(sc.nextLine());
        printSmallest(a,b,c);
    }

    private static void printSmallest(int a, int b, int c) {
        if (a<b){
            if (a<c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else{
            if (b<c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }

}
