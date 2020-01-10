import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String regex="%([A-Z][a-z]+)%[^%\\$\\.\\|]*<(\\w+)>[^%\\$\\.\\|]*\\|(\\d+)\\|[^%\\$\\.\\|]*?([\\d]+[\\.]?[\\d]+?)\\$";
        Pattern pattern=Pattern.compile(regex);
        double total=0;
        while(true){
            String line=scanner.nextLine();
            if (line.equals("end of shift")){
                break;
            }
            Matcher matcher=pattern.matcher(line);
            if (matcher.find()){
                String customerName=matcher.group(1);
                String product=matcher.group(2);
                int count=Integer.parseInt(matcher.group(3));
                double price=Double.parseDouble(matcher.group(4));

                System.out.printf("%s: %s - %.2f%n",
                        customerName,product,count*price);
                total+=count*price;
            }
        }
        System.out.printf("Total income: %.2f%n",total);

    }
}
