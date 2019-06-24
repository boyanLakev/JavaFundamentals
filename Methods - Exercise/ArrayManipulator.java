import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //read array
       int[] array= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[] command=new String[3];

        do{
            command=scanner.nextLine().split("\\s+");
            if (command[0].equalsIgnoreCase("exchange")){
                exchange(array,command[1]);
            }else if(command[0].equalsIgnoreCase("max")){
                maxInArray(array,command[1]);
            }else if(command[0].equalsIgnoreCase("min")){
                minInArray(array,command[1]);
            }else if(command[0].equalsIgnoreCase("first")){
                firstElement(array,command[1],command[2]);
            }else if(command[0].equalsIgnoreCase("last")){
                lastElement(array,command[1],command[2]);
            }


        }while (!command[0].equalsIgnoreCase("end"));
        //end array view
        viewArray(array);
    }

    private static void lastElement(int[] array, String count, String kind) {
        int countInt=Integer.parseInt(count);
        if (countInt<1 || countInt>array.length){
            System.out.println("Invalid count");
            return;
        }
        String result="]";
        int countOdd=0;
        int countEven=0;
        if (kind.equalsIgnoreCase("odd")){
            for (int i = array.length-1; i >=0 ; i--) {
                if (array[i]%2!=0){
                    if (countOdd >0) {
                        result =  array[i]+", " +result;
                    }else result=array[i]+result;
                    countOdd++;
                    if (countOdd==countInt  ){

                        break;
                    }
                }

            }
            result="["+result;
            System.out.println(result);
        }else if(kind.equals("even")){
            for (int i = array.length-1; i >=0 ; i--) {
                if (array[i]%2==0){
                    if (countEven >0) {
                        result =  array[i]+", " +result;
                    }else result=array[i]+result;
                    countEven++;
                    if (countEven==countInt  ){

                        break;
                    }
                }

            }
            result="["+result;
            System.out.println(result);
        }

    }

    private static void firstElement(int[] array, String count, String kind) {
        int countInt=Integer.parseInt(count);
        if (countInt<1 || countInt>array.length){
            System.out.println("Invalid count");
            return;
        }
        String result="[";
        int countOdd=0;
        int countEven=0;
        if (kind.equalsIgnoreCase("odd")){
            for (int i = 0; i <array.length ; i++) {
                if (array[i]%2!=0){
                    if (countOdd >0) {
                        result += ", " + array[i];
                    }else result+=array[i];
                    countOdd++;
                    if (countOdd==countInt  ){

                        break;
                    }
                }

            }
            result+="]";
            System.out.println(result);
        }else if(kind.equals("even")){
            for (int i = 0; i <array.length ; i++) {
                if (array[i]%2==0){
                    if (countEven >0) {
                        result += ", " + array[i];
                    }else result+=array[i];
                    countEven++;
                    if (countEven==countInt  ){

                        break;
                    }
                }

            }
            result+="]";
            System.out.println(result);
        }
    }

    private static void minInArray(int[] array, String s) {
        int minOdd=Integer.MAX_VALUE;
        int minOddIndex=-1;
        int minEven=Integer.MAX_VALUE;
        int minEvenIndex=-1;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2!=0){
                if(array[i]<=minOdd){
                    minOdd=array[i];
                    minOddIndex=i;
                }
            }else if(array[i]<=minEven){
                minEven=array[i];
                minEvenIndex=i;
            }


        }
        if (s.equals("even")&&minEven!=Integer.MAX_VALUE){
            System.out.println(minEvenIndex);
            return;
        }else if(s.equals("odd") && minOdd!=Integer.MAX_VALUE){
            System.out.println(minOddIndex);
            return;
        }else{
            System.out.println("No matches");
        }
    }

    private static void maxInArray(int[] array, String s) {
        int maxOdd=Integer.MIN_VALUE;
        int maxOddIndex=-1;
        int maxEven=Integer.MIN_VALUE;
        int maxEvenIndex=-1;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2!=0){
                if(array[i]>=maxOdd){
                    maxOdd=array[i];
                    maxOddIndex=i;
                }
            }else if(array[i]>=maxEven){
                maxEven=array[i];
                maxEvenIndex=i;
            }


        }
        if (s.equals("even")&&maxEven!=Integer.MIN_VALUE){
            System.out.println(maxEvenIndex);
            return;
        }else if(s.equals("odd") && maxOdd!=Integer.MIN_VALUE){
            System.out.println(maxOddIndex);
            return;
        }else{
            System.out.println("No matches");
        }
    }

    private static void exchange(int[] array, String position) {
        int fromPosition=Integer.parseInt(position);
        if (fromPosition<0 || fromPosition>array.length-1){
            System.out.println("Invalid index");
            return;
        }

        int[] newArray=new int[array.length];
        int index=0;
        for (int i = fromPosition+1; i <array.length ; i++) {
            newArray[index]=array[i];
            index++;

        }
        for (int i = 0; i <=fromPosition ; i++) {
            newArray[index]=array[i];
            index++;

        }
        for (int i = 0; i <array.length ; i++) {
            array[i]=newArray[i];
        }

    }


    private static void viewArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i <array.length ; i++) {
            if(array.length-1!=i){
                System.out.print(array[i]+", ");
            }else{
                System.out.println(array[i]+"]");
            }
        }
    }
}
