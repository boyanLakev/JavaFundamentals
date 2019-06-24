import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=Integer.parseInt(sc.nextLine());
        int y1=Integer.parseInt(sc.nextLine());
        int x2=Integer.parseInt(sc.nextLine());
        int y2=Integer.parseInt(sc.nextLine());
        printClosetPoint(x1,y1,x2,y2);
    }

    private static void printClosetPoint(int x1, int y1, int x2, int y2) {
        if(Math.abs(x1+y1)<=Math.abs(x2+y2)){
            System.out.printf("(%d, %d)",x1,y1);
            System.out.println();
        }else{
            System.out.printf("(%d, %d)",x2,y2);
            System.out.println();
        }
    }

}
