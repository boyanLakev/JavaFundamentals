import java.util.*;

public class Problem1Concert {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Integer> timeBand=new HashMap<>();
        Map<String, Set<String>> bandMember=new LinkedHashMap<>();
        while(true){
            String line=scanner.nextLine();
            if (line.equals("start of concert")){
                break;
            }
            String[] part=line.split("; ");
            String command=part[0];
            String band=part[1];
            if(command.equals("Play")){
                int time=Integer.parseInt(part[2]);
                if (timeBand.containsKey(band)){
                    timeBand.put(band,timeBand.get(band)+time);

                }else {
                    timeBand.put(band,time);
                }
            }
            if (command.equals("Add")){
                String[] member=part[2].split(", ");
                if (!bandMember.containsKey(band)){
                    bandMember.put(band,new LinkedHashSet<>());
                }
                for (String s : member) {
                    bandMember.get(band).add(s);
                }

            }
        }

        int totalTime=0;
        for (Map.Entry<String, Integer> entry : timeBand.entrySet()) {
            totalTime+=entry.getValue();
        }
        System.out.println("Total time: "+totalTime);

        timeBand.entrySet().stream()
                .sorted((e1,e2)-> {
                   int sort= Integer.compare(e2.getValue(),e1.getValue());
                   if (sort==0){
                       sort=e1.getKey().compareTo(e2.getKey());

                   }
                   return sort;
                }).forEach(e-> System.out.println(e.getKey()+" -> "+e.getValue()));

        String group=scanner.nextLine();
        System.out.println(group);
        if (bandMember.containsKey(group)){
            for (String s : bandMember.get(group)) {
                System.out.println("=> "+s);
            }

        }

    }
}
