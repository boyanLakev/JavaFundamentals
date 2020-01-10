import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        while (true) {
            String line=scanner.nextLine();
            if (line.equals("End")){
                break;
            }
            String[] part=line.split("\\s+");
            String command=part[0];
            switch (command){
                case "Add":
                    text+=part[1];
                    break;
                case "Upgrade":
                    char ch=part[1].charAt(0);
                    for (char c : text.toCharArray()) {
                        text=text.replace(ch,(char)(ch+1));
                    }

                    break;
                case "Print":
                    System.out.println(text);
                    break;
                case "Index":
                    if (text.contains(part[1])){
                        List<Integer> list=new ArrayList<>();
                        for (int i = 0; i <text.length() ; i++) {
                            if (part[1].charAt(0)==(text.charAt(i))){

                                    System.out.print(i+" ");

                            }
                        }
                        System.out.println();
                    }else{
                        System.out.println("None");
                    }
                    break;
                case "Remove":
                    text=text.replace(part[1],"");
                    break;
            }
        }
    }
}
