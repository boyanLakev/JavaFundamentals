import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LastStop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<Integer> painting= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while(true){
            String line= scanner.nextLine();
            if (line.equals("END")){
                break;
            }
            String[] command=line.split("\\s+");
            switch (command[0]){
                case "Change":
                    int paintingNumber=Integer.parseInt(command[1]);
                    int changeNumber=Integer.parseInt(command[2]);
                    int indexPainting=painting.indexOf(paintingNumber);


                    if (indexPainting==-1){break;}


                    painting.set(indexPainting,changeNumber);

                    break;
                case "Hide":
                    int value=Integer.parseInt(command[1]);
                    int index=painting.indexOf(value);
                    if (index==-1){break;}
                    painting.remove(index);
                    break;
                case "Switch":
                    int painOne=Integer.parseInt(command[1]);
                    int painTwo=Integer.parseInt(command[2]);
                    int indexOne=painting.indexOf(painOne);
                    int indexTwo=painting.indexOf(painTwo);
                    if (indexOne==-1 || indexTwo==-1){break;}
                     int temp=painting.get(indexOne);
                     painting.set(indexOne,painting.get(indexTwo));
                     painting.set(indexTwo,temp);
                    break;
                case "Insert":
                    index=Integer.parseInt(command[1])+1;
                    if (index<0 || index>painting.size()-1){break;}
                    painting.add(index,Integer.parseInt(command[2]));
                    break;
                case "Reverse":
                    Collections.reverse(painting);
                    break;

            }


        }
        for (int i = 0; i <painting.size() ; i++) {
            System.out.print(painting.get(i)+" ");
        }
        System.out.println();
    }
}
