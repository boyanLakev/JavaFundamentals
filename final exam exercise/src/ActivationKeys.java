import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("&");
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+$");
        List<String> list=new ArrayList<>();
        for (int i = 0; i < text.length; i++) {
            Matcher matcher = pattern.matcher(text[i]);
            if (matcher.find()) {
                String result = matcher.group();
                String code = "";
                if (16 == result.length()) {
                    int count=1;
                    for (int j = 0; j < result.length(); j++) {
                        char ch=result.charAt(j);
                        String symbol;
                        if (Character.isLowerCase(ch)){
                           symbol= (ch+"").toUpperCase();
                        }else  if (Character.isDigit(ch)) {
                            int n= 9- ch+'0';
                            ch=(char) ('0'+n);
                            symbol=ch+"";
                        }else {
                            symbol=ch+"";
                        }
                        if (count%4==0 && count!=16){
                            code+=symbol;
                            code+="-";
                        }else{
                            code+=symbol;
                        }
                        count++;
                    }
                    list.add(code);

                }
                if (25 == result.length()) {
                    int count=1;
                    for (int j = 0; j < result.length(); j++) {
                        char ch=result.charAt(j);
                        String symbol;
                        if (Character.isLowerCase(ch)){
                            symbol= (ch+"").toUpperCase();
                        }else if (Character.isDigit(ch)) {
                            int n= 9- ch+'0';
                            ch=(char) ('0'+n);
                            symbol=ch+"";
                        }else {
                            symbol=ch+"";
                        }
                        if (count%5==0 && count!=25){
                            code+=symbol+"-";
                        }else{
                            code+=symbol;
                        }
                        count++;

                    }
                    list.add(code);
                }
            }
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i));
            if (i!=list.size()-1){
                System.out.print(", ");
            }
        }
        System.out.println();

    }
}
