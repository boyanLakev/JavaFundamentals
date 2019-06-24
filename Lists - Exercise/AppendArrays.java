import javax.xml.transform.sax.SAXResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String line=sc.nextLine();
        String[] array=line.split("\\|+");

        List<Integer> output=new ArrayList<>();
        for (int i = array.length-1; i >=0 ; i--) {
            String[] curent=array[i].split("\\s+");
            for (int j = 0; j <curent.length ; j++) {

                output.add(Integer.parseInt(curent[j]));
            }
        }
        for (int i = 0; i <output.size() ; i++) {
            System.out.print(output.get(i)+" ");
        }


    }
}
