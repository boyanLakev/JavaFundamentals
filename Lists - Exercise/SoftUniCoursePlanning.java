import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<String> schedule= Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        while (true){
            String line=scanner.nextLine();
            if ("course start".equals(line)){
                break;
            }
            String[] command=line.split("\\:+");
            switch (command[0]){
                case "Add":
                    String subject=command[1];
                    if (!schedule.contains(subject)) {
                        schedule.add(subject);
                    }
                    break;
                case "Insert":
                    subject=command[1];

                    if (!schedule.contains(subject)){
                        int index = Integer.parseInt(command[2]);
                        if (index>=0 && index<=schedule.size()-1) {
                            schedule.add(index, subject);
                        }
                    }

                    break;
                case "Remove":
                    subject=command[1];
                    if (schedule.contains(subject)) {
                        schedule.remove(subject);
                        if (schedule.contains(subject.concat("-Exercise"))) {
                            schedule.remove(subject.concat("-Exercise"));

                        }
                    }
                    break;
                case "Swap":
                    String first=command[1];
                    String second=command[2];
                    if (schedule.contains(first)&&schedule.contains(second)){
                        int firstIndex=schedule.indexOf(first);
                        int secondIndex=schedule.indexOf(second);
                        boolean firstExersice=(schedule.contains(first.concat("-Exercise")))
                                ? true
                                : false;
                        boolean secondExersice=(schedule.contains(second.concat("-Exercise")))
                                ? true
                                : false;
                        String temp=schedule.get(firstIndex);
                        schedule.set(firstIndex,schedule.get(secondIndex));
                        schedule.set(secondIndex,temp);
                        if (firstExersice && secondExersice){
                            schedule.set(firstIndex+1,schedule.get(firstIndex).concat("-Exercise"));
                            schedule.set(secondIndex+1,schedule.get(secondIndex).concat("-Exercise"));
                        }else if(firstExersice ){
                            if (firstIndex<secondIndex){

                                schedule.add(secondIndex+1,schedule.get(secondIndex).concat("-Exercise"));
                                schedule.remove(firstIndex+1);
                            }else{
                                schedule.remove(firstIndex+1);
                                schedule.add(secondIndex+1,schedule.get(secondIndex).concat("-Exercise"));

                            }
                        }else if(secondExersice){
                            if (firstIndex>secondIndex){

                                schedule.add(firstIndex+1,schedule.get(firstIndex).concat("-Exercise"));
                                schedule.remove(secondIndex+1);
                            }else{
                                schedule.remove(secondIndex+1);
                                schedule.add(firstIndex+1,schedule.get(firstIndex).concat("-Exercise"));

                            }

                        }



                    }
                    break;
                case "Exercise":
                    subject=command[1];
                    if (schedule.contains(subject)){
                        int index=schedule.indexOf(subject);
                        schedule.add(index+1,subject.concat("-Exercise"));

                    }else{
                        schedule.add(subject);
                        schedule.add(subject.concat("-Exercise"));
                    }
                    break;
            }



        }
        for (int i = 0; i <schedule.size() ; i++) {
            System.out.printf("%d.%s%n",i+1,schedule.get(i));
        }
    }
}
