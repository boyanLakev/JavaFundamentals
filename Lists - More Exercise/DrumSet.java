import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money=Double.parseDouble(scanner.nextLine());
        List<Integer> quality= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> initialQuality=new ArrayList<>();
        for (int i = 0; i <quality.size(); i++) {
            initialQuality.add(quality.get(i));
        }
        while(true){
            String line= scanner.nextLine();
            if (line.equals("Hit it again, Gabsy!")){
                break;
            }
            int hitDrum=Integer.parseInt(line);
            for (int i = 0; i <quality.size(); i++) {
                quality.set(i,quality.get(i)-hitDrum);
            }
            for (int i = 0; i <quality.size() ; i++) {
                if (quality.get(i)<=0){
                    double priceDrum=initialQuality.get(i)*3;
                    if (money-priceDrum>=0){
                        money-=priceDrum;
                        quality.set(i,initialQuality.get(i));
                    }else {
                        quality.remove(i);
                        initialQuality.remove(i);
                        i--;
                    }
                }
            }
        }
        for (int i = 0; i <quality.size() ; i++) {
            System.out.print(quality.get(i)+" ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.",money);

    }
}
