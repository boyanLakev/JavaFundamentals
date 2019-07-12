import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Integer> keyMaterial=new LinkedHashMap<>();
        keyMaterial.put("shards",0);
        keyMaterial.put("fragments",0);
        keyMaterial.put("motes",0);
        Map<String,String> printKey=new HashMap<>();
        printKey.put("shards","Shadowmourne");
        printKey.put("fragments","Valanyr");
        printKey.put("motes","Dragonwrath");
        Map<String,Integer> junk=new TreeMap<>();
        boolean exit=false;

        while(true){
            String[] input=scanner.nextLine().split("\\s+");
            for (int i = 0; i <input.length ; i+=2) {
                int value=Integer.parseInt(input[i]);
                String key=input[i+1].toLowerCase();
                if (keyMaterial.containsKey(key)){
                    keyMaterial.put(key,keyMaterial.get(key)+value);
                    if (keyMaterial.get(key)>=250){
                        keyMaterial.put(key,keyMaterial.get(key)-250);
                        System.out.println(printKey.get(key)+" obtained!");
                        exit=true;
                        break;
                    }


                }else {
                    junk.putIfAbsent(key,0);
                    junk.put(key,junk.get(key)+value);
                }
            }
            if(exit){
                break;
            }
        }
        keyMaterial.entrySet().stream().sorted((e1,e2)->{
        int sort= Integer.compare(e2.getValue(),e1.getValue());
        if (sort==0){
            sort=e1.getKey().compareTo(e2.getKey());
        }
        return sort;

        }).forEach(e->
                System.out.println(
                String.format("%s: %d",e.getKey(),e.getValue())
        ) );
        junk.entrySet().forEach(e->
                System.out.println(
                        String.format("%s: %d",e.getKey(),e.getValue())
                ));


    }
}
