import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int snowballSnow=0;
        int snowballTime=0;
        int snowballQuality=0;
        BigInteger snowballValue=new BigInteger("0");
        for (int i = 0; i <n ; i++) {
            int snow=Integer.parseInt(sc.nextLine());
            int time=Integer.parseInt(sc.nextLine());
            int quality=Integer.parseInt(sc.nextLine());
            BigInteger value=BigInteger.valueOf(snow).divide(BigInteger.valueOf(time));
                    value=value.pow(quality);
            if (value.compareTo(snowballValue) ==1){
                snowballValue=value;
                snowballSnow=snow;
                snowballTime=time;
                snowballQuality=quality;
            }


        }
        System.out.printf("%d : %d = %s (%d)",snowballSnow ,snowballTime,snowballValue,snowballQuality);
    }
}
