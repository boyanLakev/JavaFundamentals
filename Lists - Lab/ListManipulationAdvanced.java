import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true){
            String line=sc.nextLine();
            if(line.equalsIgnoreCase("end")){
                break;
            }
            String[] tokens = line.split("\\s+");
            switch (tokens[0]){
                case "Contains":
                    int containNumber=Integer.parseInt(tokens[1]);
                    int compare=numbers.indexOf(containNumber);
                    if(compare!=-1){
                        System.out.println("Yes");
                    }else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if ("even".equals(tokens[1])){
                        for (int i = 0; i <numbers.size(); i++) {
                            if(numbers.get(i)%2==0){
                                System.out.print(numbers.get(i)+" ");
                            }
                        }
                        System.out.println();
                    }else if(tokens[1].equals("odd")){
                        for (int i = 0; i <numbers.size(); i++) {
                            if(numbers.get(i)%2!=0){
                                System.out.print(numbers.get(i)+" ");
                            }
                        }
                        System.out.println();
                    }


                    break;
                case "Filter":
                    String condition=tokens[1];
                    int num=Integer.parseInt(tokens[2]);
                    boolean resultCondition=false;
                    for (int element:numbers ) {
                        switch (condition){
                            case "<":
                                resultCondition=(element<num)? true:false;
                                break;
                            case ">":
                                resultCondition=(element>num)? true:false;
                                break;
                            case "<=":
                                resultCondition=(element<=num)? true:false;
                                break;
                            case ">=":
                                resultCondition=(element>=num)? true:false;
                                break;
                        }
                        if(resultCondition){
                            System.out.print(element+" ");
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    if ("sum".equals(tokens[1])){
                        int sum=0;
                        for (int el:numbers ) {
                         sum+=el;
                        }
                        System.out.println(sum);
                    }
                    break;



            }
        }


    }
}
