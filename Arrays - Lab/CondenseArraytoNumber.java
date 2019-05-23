import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraytoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] input= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int check=0;
        for (int i = input.length-1; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
                input[j]=input[j]+input[j+1];

            }
        }

        System.out.println(input[0]);
    }
}
