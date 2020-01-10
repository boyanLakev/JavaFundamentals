import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deciphering {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        String[] code=scanner.nextLine().split("\\s+");
        Pattern pattern =Pattern.compile("^([d-z{}|#]+)$");
        Matcher matcher=pattern.matcher(text);
        if(matcher.find()){
            StringBuilder newText=new StringBuilder();
            String result=matcher.group();
            for (int i = 0; i <result.length() ; i++) {
                char ch=result.charAt(i);
                ch=(char) (ch-3);
                newText=newText.append(ch);

            }
            result=newText.toString();
            result=result.replace(code[0],code[1]);
            System.out.println(result);

        }else{
            System.out.println("This is not the book you are looking for.");
        }
    }
}
