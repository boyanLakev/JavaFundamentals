import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int wagonCount=Integer.parseInt(scanner.nextLine());
        int[] wagon=new int[wagonCount];
        int sum=0;
        for (int number:wagon){
            wagon[number]=Integer.parseInt(scanner.nextLine());
            sum+=wagon[number];
            System.out.print(wagon[number]+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
