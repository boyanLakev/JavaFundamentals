import java.util.Scanner;

public class Messages {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int count=Integer.parseInt(scanner.nextLine());

        String result="";
        for(int i=0;i<count;i++){
            String  numString=scanner.nextLine();
            int n=Integer.parseInt(numString);
            int num=n%10;
            int longer=numString.length();
            if (num>=2 &&num<=7){

                result=result+""+(char)(96+(num-2)*3+longer);



            }else {
                if ( num==8){
                    result+=(char)(97+6*3+longer) ;

                }
                if ( num==9){
                    result+=(char)(97+7*3+longer) ;

                }else if(num==0) {
                    result+=" ";
                }
            }


        }
        System.out.println();
        System.out.println(result);
    }
}
