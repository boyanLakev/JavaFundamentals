import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrivingInKathmandu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            String line=scanner.nextLine();
            if (line.equals("Last note")){
                break;
            }
            Pattern pattern=Pattern.compile("^([A-Za-z0-9!@#$?]+)=([0-9]+)<<([a-z0-9]+)");
            Matcher matcher=pattern.matcher(line);
            if (matcher.find()){
                String peak=matcher.group(1);
                peak=peak.replaceAll("[!?@$#]","");
                int code=Integer.parseInt(matcher.group(2));
                String geocode=matcher.group(3);
                if (code==geocode.length()){
                    System.out.printf("Coordinates found! %s -> %s%n",peak,geocode);
                }else{
                    System.out.println("Nothing found!");
                }

            }else{
                System.out.println("Nothing found!");
            }

        }
    }
}
