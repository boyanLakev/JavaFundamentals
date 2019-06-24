import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] array=scanner.nextLine().split("\\s+");
        List<String> list=new ArrayList<>();
        for (int i = 0; i <array.length ; i++) {
            list.add(array[i]);
        }
        while(true){
            String[] comand=scanner.nextLine().split("\\s+");
            if ("3:1".equals(comand[0])){
                break;
            }
            switch (comand[0]){
                case "merge":
                    int startIndex=Integer.parseInt(comand[1]);
                    int endIndex=Integer.parseInt(comand[2]);
                    startIndex=Math.max(0,startIndex);
                    endIndex=Math.min(endIndex,list.size()-1);
                    for (int i = startIndex+1; i <=endIndex ; i++) {
                        list.set(startIndex,list.get(startIndex)+list.get(i));
                     }
                    for (int i = startIndex+1; i <=endIndex ; i++) {
                        list.remove(startIndex+1);
                    }

                    break;
                case "divide":
                    int index=Integer.parseInt(comand[1]);
                    int partitions=Integer.parseInt(comand[2]);
                    if (index<0 ||index>list.size()-1){break;}
                    String part=list.get(index);
                    list.remove(index);
                    int longer=part.length();
                    int count=longer/partitions;
                    int countLast=(longer%partitions!=0) ?count+longer%partitions:count;
                    int ch=0;
                    for (int i = 0; i <partitions ; i++) {
                        String insert="";
                        int chLong=(i==partitions-1)? countLast:count;
                        for (int j = 0; j <chLong; j++) {
                            insert+=part.charAt(ch);
                            ch++;
                        }
                        list.add(index+i,insert);
                    }
                    break;
            }
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }


    }
}
