import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<Integer> list= Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true){
            String commands=scanner.nextLine();
            if ("end".equalsIgnoreCase(commands)){
                break;
            }
            String[] lineSplit=commands.split("\\s+");
            switch (lineSplit[0]){
                case "Add":
                    list.add(Integer.parseInt(lineSplit[1]));
                    break;
                case "Insert":
                    int index =Integer.parseInt(lineSplit[2]);
                    if (index<0 || index>list.size()){
                        System.out.println("Invalid index");
                    }else {
                        list.add(Integer.parseInt(lineSplit[2]),
                                Integer.parseInt(lineSplit[1]));
                    }
                    break;
                case "Remove":
                    int indexr =Integer.parseInt(lineSplit[1]);
                    if (indexr<0 || indexr>list.size()){
                        System.out.println("Invalid index");
                    }else {
                        list.remove(Integer.parseInt(lineSplit[1]));
                    }
                    break;
                case "Shift":
                    if ("left".equalsIgnoreCase(lineSplit[1])){


                        for (int i = 0; i <Integer.parseInt(lineSplit[2]) ; i++) {
                            int temp=list.get(0);
                            list.remove(0);
                            list.add(temp);
                        }
                    }else{
                        for (int i = 0; i <Integer.parseInt(lineSplit[2]) ; i++) {
                            int temp=list.get(list.size()-1);
                            list.remove(list.size()-1);
                            list.add(0,temp);
                        }

                    }

                    break;
            }
        }
        for (int arg:list  ) {
            System.out.print(arg+" ");
        }
    }
}
