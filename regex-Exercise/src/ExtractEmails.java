import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Pattern pattern=Pattern.compile("\\b[A-Za-z0-9][A-Za-z0-9\\.\\-_]+@[a-z]+([\\.-]?[a-z]+)+[\\.][a-z]+\\b");
        String text=scanner.nextLine();
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
