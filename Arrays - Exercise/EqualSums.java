import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int[] array= Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
            int sumleft=0;
            int sumrigth=0;
            boolean result=false;
        for (int i = 0; i <array.length ; i++) {
            sumleft=0;
            sumrigth=0;
            for (int j = 0; j <i; j++) {
                sumleft+=array[j];
            }
            for (int j = array.length-1; j >i ; j--) {
                sumrigth+=array[j];
            }
            if(sumleft==sumrigth){
                System.out.println(i);
                result=true;
                break;
            }
        }
        if (!result){
            System.out.println("no");
        }

    }
}
