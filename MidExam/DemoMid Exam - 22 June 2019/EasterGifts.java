import java.util.Scanner;

public class EasterGifts {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] gifts=scanner.nextLine().split("\\s+");
        while (true){

            String line=scanner.nextLine();
            if(line.equals("No Money")){
                break;
            }
            String[] command=line.split("\\s+");
            switch (command[0]){
                case "OutOfStock":
                    for (int i = 0; i <gifts.length ; i++) {
                        if (command[1].equals(gifts[i])){
                            gifts[i]="None";
                        }
                    }
                    break;
                case "Required":
                    String gift= command[1];
                    int index=Integer.parseInt(command[2]);
                    if (index<0 || index>gifts.length-1){
                        break;
                    }
                    gifts[index]=gift;
                    break;
                case "JustInCase":
                     gift= command[1];
                     index=gifts.length-1;
                    gifts[index]=gift;

                    break;

            }
        }
        for (int i = 0; i <gifts.length ; i++) {
            if(!"None".equals(gifts[i])){
                System.out.print(gifts[i]+" ");
            }
        }
        System.out.println();
    }
}
