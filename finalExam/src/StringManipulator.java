import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String text=scanner.nextLine();
        while(true){
            String line=scanner.nextLine();
            if (line.equals("Done")){
                break;
            }
            String[] part=line.split("\\s+");
            String command=part[0];
            switch (command){
                case "Change":
                    char ch=part[1].charAt(0);
                    char replacement=part[2].charAt(0);
                    text=text.replace(ch,replacement);
                    System.out.println(text);
                    break;
                case "Includes":
                    if(text.contains(part[1])){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String string=part[1];
                    int lent=text.length();
                    int len=string.length();
                    String sub=text.substring((lent-len));
                    if(string.equals(sub)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    text=text.toUpperCase();
                    System.out.println(text);
                    break;
                case "FindIndex":
                     char f=part[1].charAt(0);
                     String fine=f+"";

                     int in=text.indexOf(fine);
                    System.out.println(in);
                    break;
                case "Cut":
                    int fInd=Integer.parseInt(part[1]);
                    int lenght=Integer.parseInt(part[2]);
                    if (fInd>0 && fInd<=text.length()-1) {
                        String before = text.substring(0, fInd);
                        String after="";
                        String middle="";
                        if (fInd+lenght<text.length()){
                             after=text.substring(fInd+lenght);
                             middle=text.substring(fInd,fInd+lenght);

                        }else{
                            middle=text.substring(fInd);
                        }
                        text=before+after;
                        System.out.println(middle);

                    }


                    break;
            }
        }
    }
}
