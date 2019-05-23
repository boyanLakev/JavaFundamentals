
import java.util.Arrays;
import java.util.Scanner;

public class EvenandOddSubtraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array= Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e ->Integer.parseInt(e))
                .toArray();
        int even=0;
        int odd=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==0){
                even+=array[i];
            }else{
                odd+=array[i];
            }

        }
        System.out.println(even-odd);
    }
}
