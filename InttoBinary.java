import java.util.Scanner;

public class InttoBinary {
    public static void main(String[] args) {

        int []arr= new int[20];
        int i=1,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the integer:");
        int number = sc.nextInt();

        while (number!=0) {
            arr[j++] = (int)(number % 2);
            number=number/2;
        }
        for(i=0;i>=0;i--)
            System.out.print("binary number is:"+ arr[i]);


    }
}
code by Rajesh Patro
