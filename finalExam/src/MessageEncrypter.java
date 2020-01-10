import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageEncrypter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());


        Pattern pattern=Pattern.compile("([*@])([A-Z][a-z]{3,})\\1: [\\[]([A-Za-z])[\\]][\\|][\\[]([A-Za-z])[\\]][\\|][\\[]([A-Za-z])[\\]][\\|]$");
        for (int i = 0; i <n ; i++) {
            String text=scanner.nextLine();
            Matcher matcher=pattern.matcher(text);
            if (matcher.find()){
                String partall=matcher.group(2);
                char first=matcher.group(3).charAt(0);
                char second=matcher.group(4).charAt(0);
                char trird=matcher.group(5).charAt(0);
                System.out.printf("%s: %d %d %d%n",partall,(int)first,(int)second,(int)trird);

            }else {
                System.out.println("Valid message not found!");
            }

        }
    }
}
