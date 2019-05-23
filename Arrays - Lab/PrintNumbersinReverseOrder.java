import java.util.Scanner;

public class PrintNumbersinReverseOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=Integer.parseInt(sc.nextLine());
        int[] array=new int[number];

        for (int i = number-1; i >=0 ; i--) {
            array[i]=Integer.parseInt(sc.nextLine());

        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");

        }


    }
}
