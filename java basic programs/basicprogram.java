import java.util.Scanner;
class Basicprogram{
    public static void main(String args[])
    {
        int a=3;
        int b=3;
        int c= a+b;
        System.out.println(c);
        //get integer from user and add
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number you want to add:");
        int x=sc.nextInt();
        Scanner cc=new Scanner(System.in);
        System.out.println("Enter the second number you want to add:");
        int y=cc.nextInt();
        int z= x + y;

        System.out.println("Addition:" + z);


    }
}