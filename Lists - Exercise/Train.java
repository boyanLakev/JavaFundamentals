import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> wagons= Arrays.stream(sc.nextLine().split("\\s+"))
                .map(element ->Integer.parseInt(element))
                .collect(Collectors.toList());
        int capacity=Integer.parseInt(sc.nextLine());
        while (true){
            String line=sc.nextLine();
            if(line.equalsIgnoreCase("end")){
                break;
            }
            String[] tokens=line.split("\\s+");
            if ("Add".equalsIgnoreCase(tokens[0])){
                wagons.add(Integer.parseInt(tokens[1]));
            }else{
                int people=Integer.parseInt(line);
                for (int i = 0; i <wagons.size() ; i++) {
                    if (people+wagons.get(i)<=capacity){
                        wagons.set(i,people+wagons.get(i));
                        break;
                    }
                }
            }


        }
        for (int i = 0; i <wagons.size() ; i++) {
            System.out.print(wagons.get(i)+" ");
        }
    }
}
