import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] firstArray= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(e ->Integer.parseInt(e))
                .toArray();
        int[] secondArray=Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxLength=0;
        if (firstArray.length>secondArray.length){
            maxLength=firstArray.length;
        }else{
            maxLength=secondArray.length;
        }
        int sum=0;
        boolean check=true;
        for (int i = 0; i <maxLength ; i++) {
            sum+=firstArray[i];
            if(firstArray[i]!=secondArray[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                check=false;
                break;
            }


        }
        if(check){
            System.out.printf("Arrays are identical. Sum: %d",sum);

        }

    }
}
