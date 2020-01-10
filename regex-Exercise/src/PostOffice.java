import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        String[] line =Scanner.nextLine().split("\\|");
        //first
        String firstPart=line[0];
        Pattern pattern=Pattern.compile("([#$%*&])([A-Z]+)\\1");
        Matcher matcher=pattern.matcher(firstPart);
        String firstString="";
        if(matcher.find()){
            firstString=matcher.group(2);
        }else{
            return;
        }

        Map<Character,Integer> postMap=new LinkedHashMap<>();
        for (int i = 0; i <firstString.length() ; i++) {
            char ch=firstString.charAt(i);

                postMap.put(ch,0);

        }
        // second
        String secondPart=line[1];
        pattern=Pattern.compile("(\\d\\d):(\\d\\d)");
        matcher=pattern.matcher(secondPart);
        while(matcher.find()){
            int symbol=Integer.parseInt(matcher.group(1));
            int value=Integer.parseInt(matcher.group(2));
            char chSymbol=(char)symbol;
            if(postMap.containsKey(chSymbol)){
                if(value>postMap.get(chSymbol)){
                    postMap.put(chSymbol,value);
                }
            }
        }

        //thirt part
        String thirdPart=line[2];
        for (Map.Entry<Character, Integer> entry : postMap.entrySet()) {
            String generatPattern="(?<=\\s|^)"+entry.getKey()+"[^\\s]{"+entry.getValue()+"}\\b";
            pattern=Pattern.compile(generatPattern);
            matcher=pattern.matcher(thirdPart);
            if(matcher.find()){
                System.out.println(matcher.group());

            }
        }



    }
}
