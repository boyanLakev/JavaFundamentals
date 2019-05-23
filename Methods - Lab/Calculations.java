import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String operation=sc.nextLine();
        int num1=Integer.parseInt(sc.nextLine());
        int num2=Integer.parseInt(sc.nextLine());
        switch (operation){
            case "add" :
                addNumber(num1,num2);
                break;
            case "multiply" :
                multiplyNumber(num1,num2);
                break;
            case "subtract" :
                subtractNumber(num1,num2);
                break;
            case "divide" :
                divideNumber(num1,num2);
                break;
        }
    }

    private static void divideNumber(int num1, int num2) {
        System.out.println(num1/num2);
    }

    private static void subtractNumber(int num1, int num2) {
        System.out.println(num1-num2);
    }

    private static void multiplyNumber(int num1, int num2) {
        System.out.println(num1*num2);
    }

    private static void addNumber(int num1, int num2) {
        System.out.println(num1+num2);
    }
}
