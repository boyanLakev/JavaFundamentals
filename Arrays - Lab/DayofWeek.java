
import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
    int dayInt=Integer.parseInt(sc.nextLine());
    String[] day={"Monday" ,"Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    if ( dayInt>=1 && dayInt<=7){
        System.out.println(day[dayInt-1]);
    }else{
        System.out.println("Invalid day!");
    }
}
}
