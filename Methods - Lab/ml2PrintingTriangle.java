import java.util.Scanner;

public class ml2PrintingTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());
        printTriangle(num);
    }

    private static void printTriangle(int num) {
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = num-1; i>=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}
