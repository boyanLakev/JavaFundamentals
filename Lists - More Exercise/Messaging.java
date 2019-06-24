import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<String> list= Arrays.stream(scanner.nextLine().split("\\s+"))
                                .collect(Collectors.toList());
        String text=scanner.nextLine();
        int textlong=text.length();
        String result="";
        for (int i = 0; i <list.size() ; i++) {
            int sum=0;
            for (int j = 0; j <list.get(i).length() ; j++) {
                sum+=(int)list.get(i).charAt(j)-(int)'0';
            }
            int numberChar=(textlong<sum)? sum%textlong: sum;

            char resultCh=text.charAt(numberChar);
            result+=resultCh;
            text=text.substring(0,numberChar-1)+text.substring(numberChar);
            textlong=text.length();
        }
        System.out.println(result);

    }
}
