import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=Integer.parseInt(sc.nextLine());
        int capacity=255;
        int avaliable=0;
        for (int i = 0; i <count; i++) {
            int litersWater=Integer.parseInt(sc.nextLine());
            if (litersWater+avaliable>capacity){
                System.out.println("Insufficient capacity!");
            }else {
                avaliable+=litersWater;
            }
        }
        System.out.println(avaliable);
    }
}
