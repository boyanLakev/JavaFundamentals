import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int[] arrayOdd=new int[60];
        int[] arrayEven=new int[60];
        arrayOdd[0]=1;
        System.out.println(arrayOdd[0]);
        for (int i = 1; i <n; i++) {
            if (i%2!=0){
                int count=0;
                arrayEven[0]=1;
                System.out.print(arrayEven[0]+" ");
                while(arrayOdd[count]!=0){
                    arrayEven[count+1]=arrayOdd[count]+arrayOdd[count+1];
                    System.out.print(arrayEven[count+1]+" ");
                    count++;
                }
                System.out.println();
            }else{
                int count=0;
                arrayOdd[0]=1;
                System.out.print(arrayOdd[0]+" ");
                while(arrayEven[count]!=0){
                    arrayOdd[count+1]=arrayEven[count]+arrayEven[count+1];
                    System.out.print(arrayOdd[count+1]+" ");
                    count++;
                }
                System.out.println();
            }

        }

    }
}
