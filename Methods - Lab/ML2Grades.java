import java.util.Scanner;

public class ML2Grades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double grade=Double.parseDouble(sc.nextLine());
        printInWords(grade);

    }

    private static void printInWords(double grade) {
        if (grade<2.99 ){
            System.out.println("Fail");
        }else  if(grade>=3 && grade<3.5){
            System.out.println("Poor");
        }else  if(grade>=3.5 && grade<4.5){
            System.out.println("Good");
        }else  if(grade>=4.5 && grade<5.5){
            System.out.println("Very good");
        }else  {
            System.out.println("Excellent");
        }
    }
}
