import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int column=Integer.parseInt(scanner.nextLine());
        String input =scanner.nextLine();
        int bestDnaLong=0;
        int bestDnaIndex=column;
        int bestSum=0;
        int bestDnaTotalSum=0;
        int sample=0;
        int bestsample=0;

        String[] bestDna=new String[column];

        while(!input.equals("Clone them!")){
            sample++;
            String[] dna=input.split("!+");
            int dnaLong=0;
            int dnaIndex=0;
            int dnaTotalSum=0;
            boolean change=false;


            for (int i = 0; i <dna.length-1 ; i++) {
                int longIndex=0;

                for (int j = i+1; j <dna.length ; j++) {
                    if (dna[j-1].equals("1") && dna[j].equals("1")){
                       longIndex++;
                       if (longIndex>dnaLong){
                           dnaLong=longIndex;
                           dnaIndex=i;
                       }


                    }else {
                        break;
                    }


                }
            }
            for (int i = 0; i <dna.length ; i++) {
                if(dna[i].equals("1")){
                    dnaTotalSum++;
                }

            }
            if (dnaLong>bestDnaLong){
                change=true;

            }else if(dnaLong==bestDnaLong){
                    if (dnaIndex<bestDnaIndex){
                        change=true;;
                    }else if(dnaIndex==bestDnaIndex){

                        if(dnaTotalSum>bestDnaTotalSum){
                            change=true;


                        }
                }

            }
            if (change){
                bestsample=sample;
                bestDnaIndex=dnaIndex;
                bestDnaLong=dnaLong;

                bestDnaTotalSum=dnaTotalSum;
                for (int i = 0; i <dna.length ; i++) {
                    bestDna[i]=dna[i];
                }

            }

            input =scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n",bestsample,bestDnaTotalSum);
        for (int i = 0; i <column ; i++) {
            System.out.print(bestDna[i]+" ");

        }
    }
}
