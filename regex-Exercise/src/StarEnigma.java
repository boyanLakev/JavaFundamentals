import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Pattern star=Pattern.compile("[STARstar]");
        Pattern grop=Pattern.compile("@([A-Za-z]+)[^@\\-!>]*?:(\\d+)[^@\\-!>]*?!([AD])![^@\\-!>]*?->(\\d+)");
        List<String> attackList=new ArrayList<>();
        List<String> destructionList=new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String line=scanner.nextLine();
            Matcher matcher=star.matcher(line);
            int starCount=0;
            while(matcher.find()){
                starCount++;
            }



            String descrip="";
            for (int j = 0; j <line.length() ; j++) {
                char ch=line.charAt(j);
                ch=(char)(ch-starCount);
                descrip+=ch;
            }
            matcher =grop.matcher(descrip);
            String planet="";
            String attackType="";
            int population=0;
            int soldier=0;

            if(matcher.find()){
                planet=matcher.group(1);
                attackType=matcher.group(3);
                population=Integer.parseInt(matcher.group(2));
                soldier=Integer.parseInt(matcher.group(4));

            }
            if(attackType.equals("A")){
                attackList.add(planet);
            }else if(attackType.equals("D")){
                destructionList.add(planet);
            }

        }
        System.out.println("Attacked planets: "+attackList.size());
        attackList.stream()
                .sorted(String::compareTo)
                .forEach(e->{
            System.out.println("-> "+e);
        });
        System.out.println("Destroyed planets: "+destructionList.size());

        destructionList.stream()
                .sorted(String::compareTo)
                .forEach(e->{
            System.out.println("-> "+e);
        });
    }
}
