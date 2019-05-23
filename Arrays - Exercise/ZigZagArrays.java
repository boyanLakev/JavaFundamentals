import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longer=Integer.parseInt(sc.nextLine());
        String  first="";
        String second="";
        for (int i = 0; i <longer ; i++) {
            String[] current=sc.nextLine().split(" ");
            if (i%2==0){
                first+=current[0]+" ";
                second+=current[1]+" ";
            }else{
                first+=current[1]+" ";
                second+=current[0]+" ";

            }

        }
       // first=first.strip();
      //  second=second.strip();
        System.out.println(first);
        System.out.println(second);
    }
}
