
import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray2 {
    public static void main(String[] args) {
        //
        Scanner sc=new Scanner(System.in);
        int numberInput=Integer.parseInt(sc.nextLine());
        String[] arrayStr=new String[numberInput];
        int[] arrayInt=new int[numberInput];
        //
        for (int i = 0; i <numberInput ; i++) {
            int sum=0;
            arrayStr[i]=sc.nextLine();

            for (int j = 0; j <arrayStr[i].length() ; j++) {
                char ch=arrayStr[i].charAt(j);

                    switch (ch) {
                        case 'a':
                        case 'o':
                        case 'i':
                        case 'u':
                        case 'e':
                        case 'A':
                        case 'O':
                        case 'I':
                        case 'U':
                        case 'E':
                            sum += ((int) ch * arrayStr[i].length());
                            break;
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'F':
                        case 'G':
                        case 'H':
                        case 'J':
                        case 'K':
                        case 'L':
                        case 'M':
                        case 'N':
                        case 'P':
                        case 'Q':
                        case 'R':
                        case 'S':
                        case 'T':
                        case 'V':
                        case 'W':
                        case 'X':
                        case 'Y':
                        case 'Z':

                            sum += ((int) ch / arrayStr[i].length());break;

                    }

            }
            arrayInt[i]=sum;




        }
        //sort
      /*  for (int i = 0; i <arrayInt.length-1; i++) {
            for (int j = i+1; j <arrayInt.length ; j++) {
                if (arrayInt[i]>arrayInt[j]){
                    int temp=arrayInt[i];
                    arrayInt[i]=arrayInt[j];
                    arrayInt[j]=temp;
                }
            }

        }*/
        Arrays.sort(arrayInt);
        //print
        for (int i = 0; i <arrayInt.length ; i++) {
            System.out.println(arrayInt[i]);

        }


    }
}
