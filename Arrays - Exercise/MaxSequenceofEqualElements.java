import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxIndex=0;
        int maxLong=0;
        for (int i = 0; i <array.length-1 ; i++) {
            int longer=0;
            for (int j = i+1; j <array.length ; j++) {

                if (array[i]==array[j]){
                    longer++;
                    if (longer>maxLong){
                        maxLong=longer;
                        maxIndex=i;
                    }
                }else {
                    break;
                }
            }

        }
        //output
        for (int i = maxIndex; i <=maxIndex+maxLong ; i++) {
            System.out.print(array[i]+" ");

        }
    }
}
