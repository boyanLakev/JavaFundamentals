import java.util.Arrays;
import java.util.Scanner;

public class LIS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array= Arrays.stream(sc.nextLine().split("\\s+")).
                        mapToInt(Integer::parseInt).
                        toArray();

        int[] lenghtIndex=new int[array.length];
        int[] conection=new int[array.length];
        // lenghtIndex each =1
        for (int i = 0; i <array.length ; i++) {
            lenghtIndex[i]=1;
        }

        //calculat lenghtIndex and conection from array
        if (array.length>1){
            for (int i = 1; i <array.length ; i++) {
                for (int j = 0; j < i; j++) {
                    if (array[j] < array[i]) {
                        if (lenghtIndex[i] <= lenghtIndex[j]) {
                            lenghtIndex[i] = lenghtIndex[j] + 1;
                            conection[i] = j;
                        }

                    }

                }

            }
        }
            //longest leftmode
            int maxIndex=0;
           if (array.length>1){
               for (int i = 1; i <array.length ; i++) {
                   if (lenghtIndex[i]>lenghtIndex[maxIndex]){
                         maxIndex=i;
                   }

               }
           }
           //creating LIS
            int[] LIS=new int[lenghtIndex[maxIndex]];
           int index=maxIndex;
            for (int i = lenghtIndex[maxIndex] -1; i >=0; i--) {
                LIS[i]=array[index];
                index=conection[index];
            }
            // print
            for (int i = 0; i <LIS.length ; i++) {
                System.out.print(LIS[i]+" ");

            }



    }
}
