import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> firstDesk= Arrays.stream(sc.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondDesk=Arrays.stream(sc.nextLine()
        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true){
            if (firstDesk.size()==0){
                break;
            }
            if (secondDesk.size()==0){
                break;
            }
            if (firstDesk.get(0)>secondDesk.get(0)){
                int tempFirst=firstDesk.get(0);
                int tempSecond=secondDesk.get(0);
                firstDesk.remove(0);
                secondDesk.remove(0);
                firstDesk.add(tempFirst);
                firstDesk.add(tempSecond);
            }else if(secondDesk.get(0)>firstDesk.get(0)){
                int tempFirst=secondDesk.get(0);
                int tempSecond=firstDesk.get(0);
                firstDesk.remove(0);
                secondDesk.remove(0);
                secondDesk.add(tempFirst);
                secondDesk.add(tempSecond);
            }else{
                firstDesk.remove(0);
                secondDesk.remove(0);
            }
        }
        if (firstDesk.size()>0){
            int sum=0;
            for (int i :firstDesk ) {
                sum+=i;
            }
            System.out.println("First player wins! Sum: "+sum);
        }else {
            int sum=0;
            for (int i :secondDesk ) {
                sum+=i;
            }
            System.out.println("Second player wins! Sum: "+sum);
        }

    }
}
