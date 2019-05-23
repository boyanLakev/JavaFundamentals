import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int yeild=Integer.parseInt(scanner.nextLine());
        int days=0;
        int totalAmound=0;
        while (yeild>=100){
            days++;
            totalAmound+=yeild;
            yeild=yeild-10;
            totalAmound-=26;
        }
        if (days!=0){
            totalAmound-=26;
        }
        System.out.println(days);
        System.out.println(totalAmound);
    }
}
