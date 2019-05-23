import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int field=Integer.parseInt(sc.nextLine());
        int[] array=new int[field];
        int startField =0;
        int endField=field-1;
        int[] bugs= Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for ( int position:bugs){
            if (position>=startField && position<=endField) {
                array[position] = 1;
            }
        }
        String[] fly=sc.nextLine().split(" ");
        while (!fly[0].equalsIgnoreCase("end")){
            int startPosition=Integer.parseInt(fly[0]);
            int moving=Integer.parseInt(fly[2]);
            if (startPosition >= startField && startPosition <= endField){
                if (array[startPosition]==1){
                        array[startPosition]=0;
                        int newPosition=startPosition;
                         while(fly[1].equalsIgnoreCase("right")) {
                             newPosition= newPosition+moving;
                             if (newPosition >= startField && newPosition <= endField){
                                 if (array[newPosition]==0){
                                     array[newPosition]=1;
                                     break;
                                 }
                             }else {
                                 break;
                             }

                         }
                        while(fly[1].equalsIgnoreCase("left")) {
                            newPosition= newPosition-moving;
                            if (newPosition >= startField && newPosition <= endField){
                                if (array[newPosition]==0){
                                    array[newPosition]=1;
                                    break;
                                }
                            }else {
                                break;
                            }

                        }



                }


            }





            fly=sc.nextLine().split(" ");
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }


    }
}
