
import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double money=Double.parseDouble(scanner.nextLine());
        int studentsCount=Integer.parseInt(scanner.nextLine());
        double sabresPrice=Double.parseDouble(scanner.nextLine());
        double robesPrice=Double.parseDouble(scanner.nextLine());
        double beltsPrice=Double.parseDouble(scanner.nextLine());
        double freeBelts=Math.ceil(studentsCount/6);
        double sum=sabresPrice*(studentsCount + Math.ceil(studentsCount*0.1));
        sum+= robesPrice* (studentsCount);
        sum+=beltsPrice*(studentsCount-freeBelts);
        if (sum>money){
            System.out.printf( "Ivan Cho will need %.2flv more.",sum-money);

        }else {
            System.out.printf("The money is enough - it would cost %.2flv.",sum);
        }


    }
}

