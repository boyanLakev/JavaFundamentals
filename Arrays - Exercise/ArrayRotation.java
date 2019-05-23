import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] array=sc.nextLine().split(" ");
        int rotation=Integer.parseInt(sc.nextLine());
        for (int i = 0; i <rotation%array.length ; i++) {
            String temp=array[0];
            for (int j = 1; j <array.length ; j++) {
               array[j-1]=array[j];

            }
            array[array.length-1]=temp;
        }
        for (int i=0;i<array.length;i++ ) {
            System.out.print(array[i]+" ");
        }
    }
}
