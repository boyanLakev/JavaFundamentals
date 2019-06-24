import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String type=sc.nextLine();
        String data=sc.nextLine();
        if (type.equals("int")){
            dataTypes(Integer.parseInt(data));
        }else if(type.equals("real")){
            dataTypes(Double.parseDouble(data));
        }else {
            dataTypes(data);
        }
    }

     static void dataTypes(String data) {
        System.out.println("$"+data+"$");
    }
    static void dataTypes(int data){
        System.out.println(data*2);
    }
    static void dataTypes(double data){
        System.out.printf("%.2f",data*1.5);
    }
}
