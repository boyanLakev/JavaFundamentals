import java.util.Scanner;

public class CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         double budget=Double.parseDouble(scanner.nextLine());
         int students=Integer.parseInt(scanner.nextLine());
         double flourPrice=Double.parseDouble(scanner.nextLine());
         double eggPrice=Double.parseDouble(scanner.nextLine());
         double apronPrice=Double.parseDouble(scanner.nextLine());
         double totalApron= apronPrice*Math.ceil(students+ (students*0.2));
         double totalEggs=eggPrice*10*students;
         int freePack=students/5;
         double totalFlour=flourPrice*(students-freePack);
         double total=totalApron+totalEggs+totalFlour;
         if(budget>=total){
             System.out.printf("Items purchased for %.2f$.",total);
         }else {
             System.out.printf("%.2f$ more needed.",total-budget);
         }

    }
}
