import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] array= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String result="";
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i]>=array[j]){
                    if (j==array.length-1){
                        result+=array[i]+" ";
                    }
                    continue;
                }else {
                    break;
                }
            }

        }
        result+=array[array.length-1]+" ";
        System.out.println(result);

    }
}
