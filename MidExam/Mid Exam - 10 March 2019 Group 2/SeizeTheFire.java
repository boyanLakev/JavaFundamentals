import java.util.Scanner;

public class SeizeTheFire {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] input=scanner.nextLine().split("#");
        int water=Integer.parseInt(scanner.nextLine());
        double efford=0;
        System.out.println("Cells:");
        int fire=0;

        for (int i = 0; i <input.length ; i++) {
            String[] cell=input[i].split("\\s+");
            String level=cell[0];
            int cellfire=Integer.parseInt(cell[2]);
            if(level.equals("High")){
                if (cellfire<81||cellfire>125){
                    continue;
                }
            }else  if(level.equals("Medium")){
                if (cellfire<51||cellfire>80){
                    continue;
                }
            }else  if(level.equals("Low")){
                if (cellfire<1||cellfire>50){
                    continue;
                }
            }
            if (water>=cellfire){
                water-=cellfire;
                System.out.println(" - "+cellfire);
                efford+=cellfire*0.25;
                fire+=cellfire;
            }
        }
        System.out.printf("Effort: %.2f%n",efford);
        System.out.printf("Total Fire: %d",fire);
    }
}
