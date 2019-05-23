import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayofStrings {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String[] array= (sc.nextLine().split(" "));
        for (int i = array.length-1; i >=0; i--) {
            System.out.print( array[i]+" ");

        }

    }
}
