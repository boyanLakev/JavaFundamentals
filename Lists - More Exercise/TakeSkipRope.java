import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String hiddenMessenge=scanner.nextLine();
        List<Integer> digit= new ArrayList<>();
        List<String> message=new ArrayList<>();
        for (int i = 0; i <hiddenMessenge.length(); i++) {
            char ch=hiddenMessenge.charAt(i);
            String current=""+ch;
            if (ch>='0'&&ch<='9'){
                digit.add((int)ch-'0');
            }else {
                message.add(""+ch);
            }

        }
        List<Integer> take= new ArrayList<>();
        List<Integer> skip= new ArrayList<>();
        for (int i = 0; i <digit.size() ; i++) {
            if (i%2==0){
                take.add(digit.get(i));
            }else{
                skip.add(digit.get(i));
            }
        }
        String result="";
        int index=1;
        for (int i = 0; i <take.size() ; i++) {
            int takeIndex=take.get(i);
            int skipIndex=skip.get(i);
            for (int j = index; j <index+takeIndex; j++) {
                if (j-1<message.size()) {
                    result += message.get(j - 1);
                }
            }
            index=index+takeIndex+skipIndex;
        }
        System.out.println(result);
    }
}
