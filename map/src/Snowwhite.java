import java.util.*;

public class Snowwhite {
    static class Draws {
        String name;
        String color;






    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Draws, Integer> map = new LinkedHashMap<>();
        List<Draws> list = new ArrayList<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Once upon a time")) {
                break;
            }
            String[] part = line.split(" <:> ");
            String name = part[0].replace( "[ <:>]","");
            String color = part[1].replace( "[ <:>]","");

            int physics = Integer.parseInt(part[2].replace( "[ <:>]",""));
            boolean newO=true;
            for (Draws draws : list) {
                if (draws.name.equals(name)&& draws.color.equals(color)){
                    if (map.get(draws) < physics) {
                        map.put(draws, physics);
                        newO=false;
                       break;
                    }
                }

            }
            if (newO) {


                Draws x = new Draws();

                x.name = name;
                x.color = color;


                list.add(x);
                map.put(x, physics);

            }



        }
        Map<String ,Integer> hat=new HashMap<>();
        for (Draws draws : list) {
            if(!hat.containsKey(draws.color)){
                hat.put(draws.color,0);
            }
            hat.put(draws.color,hat.get(draws.color)+1);
        }


  /*      list.stream().

                sorted((e1, e2) ->

                {
                    int sort = Integer.compare(map.get(e2), map.get(e1));
                    if (sort == 0) {
                        sort = e1.color.compareTo(e2.color);
                    }

                    return sort;
                })
                .forEach(e ->System.out.printf("(%s) %s <-> %d%n",e.color,e.name,map.get(e)));*/

        map.entrySet().stream().sorted((e1, e2) ->

        {
            int sort = Integer.compare(e2.getValue(), e1.getValue());
            if (sort == 0) {

                sort = hat.get(e2.getKey().color).compareTo(hat.get(e1.getKey().color));
            }

            return sort;
        })
        .forEach(e ->System.out.printf("(%s) %s <-> %d%n",e.getKey().color,e.getKey().name,e.getValue()));


    }


}

