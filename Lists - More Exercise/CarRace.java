import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> carRace= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        double firstCar=0;
        double secondCar=0.0;
        for (int i = 0; i <(int)carRace.size()/2 ; i++) {
            firstCar = (carRace.get(i)==0)
                    ?firstCar*0.8
                    :firstCar+carRace.get(i);
            secondCar=(carRace.get(carRace.size()-1-i)==0)
                    ?secondCar*0.8
                    :secondCar+carRace.get(carRace.size()-1-i);
        }
        if (firstCar<secondCar){
            System.out.printf("The winner is left with total time: %.1f",firstCar);
        }else{
            System.out.printf("The winner is right with total time: %.1f",secondCar);
        }

    }
}
