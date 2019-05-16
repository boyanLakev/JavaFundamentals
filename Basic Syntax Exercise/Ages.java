import java.util.Scanner;

public class Ages {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int age=Integer.parseInt(scanner.nextLine());
        String ageString;
        if (age>=0 &&age<=2){
            ageString="baby";
        }else  if (age>=3 &&age<=13)
            ageString = "child";
        else  if (age>=14 &&age<=19){
            ageString="teenager";
        }else  if (age>=20 &&age<=65){
            ageString="adult";
        }else  {
            ageString="elder";
        }
        System.out.println(ageString);

    }
}
