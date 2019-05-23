import java.util.Scanner;
import java.util.Arrays;
public class CommonElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String first=sc.nextLine();
        String[] firstStr=(first.split(" "));
        String[] secondStr=(sc.nextLine().split(" "));
        int maxLenght=0;
        if (firstStr.length>secondStr.length){
            maxLenght=firstStr.length;
        }else{
            maxLenght=secondStr.length;
        }
        String[] result=new String[maxLenght];
        int next=0;
        for (int i = 0; i <secondStr.length ; i++) {
            for (int j = 0; j <firstStr.length ; j++) {
                if (firstStr[j].equals(secondStr[i])){
                    result[next]=firstStr[j];
                    next++;
                }

            }

        }
        for (int i = 0; i <next; i++) {
            System.out.print(result[i]+" ");

        }
    }
}
