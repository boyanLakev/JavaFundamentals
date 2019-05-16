import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int hour=Integer.parseInt(scanner.nextLine());
        int minute=Integer.parseInt(scanner.nextLine());
        if (minute>=30){
            if (hour==23){
                hour=0;
                minute=(minute+30)%60;
            }else {
                hour+=(minute+30)/60;
                minute=(minute+30)%60;

            }
        }else{
            minute+=30;

        }
        System.out.printf("%d:%02d",hour,minute);
    }

}
