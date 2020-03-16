import java.util.Scanner;

class BinaryAddition {
    public static void main(String[] args) {
        int carry=0, i=0;
        int []arr= new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the binary element:");
        int number1 = sc.nextInt();
        System.out.println("enter the next binary element:");
        int number2= sc.nextInt();

        while (number1!=0||number2!=0) {
            arr[i++] = (int) ((number1 % 10 + number2 % 10 + carry) % 2);
            carry = (int) ((number1 % 10 + number2 % 10 + carry) / 2);
            number1 = number1 / 10;
            number2 = number2 / 10;
        }
        if (carry!=0)
            arr[i++]=carry;

        --i;
        System.out.println("sum is:");
        while(i>=0)
            System.out.print(arr[i--]);

    }
}
//coded by rajesh patro
