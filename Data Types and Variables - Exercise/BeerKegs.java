import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String maxKeg="";
        double maxBeer=0;
        for (int i = 0; i <n ; i++) {
            String kegs=scanner.nextLine();
            double radius=Double.parseDouble(scanner.nextLine());
            int height=Integer.parseInt(scanner.nextLine());
            double beer=Math.PI*radius*radius*height;
            if (beer>=maxBeer){
                maxBeer=beer;
                maxKeg=kegs;
            }

        }
        System.out.println(maxKeg);
    }
}
