import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array= Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        int total=Integer.parseInt(sc.nextLine());
        for (int i = 0; i <array.length -1; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i]+array[j]==total){
                    System.out.print(array[i]+" "+array[j]);
                    System.out.println();
                }

            }

        }
    }
}
