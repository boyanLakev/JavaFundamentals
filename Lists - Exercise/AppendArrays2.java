import java.util.Scanner;

public class AppendArrays2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String line=sc.nextLine();
        String[] array=line.split("\\|+");
        String output="";
        for (int i = array.length-1; i >=0 ; i--) {
            output+=array[i]+" ";
        }
        output=output.replaceAll("\\s+"," ");

        System.out.println(output);
    }
}
