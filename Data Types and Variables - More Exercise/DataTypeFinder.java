import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true){
            String dataType=sc.nextLine();
            if (dataType.equalsIgnoreCase("end")){
                break;
            }
            if (isInt(dataType)){
                System.out.printf("%s is integer type%n",dataType);
            }else if(isDouble(dataType)){
                System.out.printf("%s is floating point type%n",dataType);
            }else if(isChar(dataType)){
                System.out.printf("%s is character type%n",dataType);
            }else if(dataType.equalsIgnoreCase("false") || dataType.equalsIgnoreCase("true")){
                System.out.printf("%s is boolean type%n",dataType);
            }else {
                System.out.printf("%s is string type%n", dataType);

            }

        }
    }

    static boolean isInt(String value){
        try {
            Integer.parseInt(value);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    static boolean isDouble(String value){
        try {
            Double.parseDouble(value);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    static boolean isChar(String value){
        if (value.equals("")){
            return false;
        }
        try{
            value.charAt(1);
            return false;
        }catch (StringIndexOutOfBoundsException e){

            return true;
        }
    }

}
