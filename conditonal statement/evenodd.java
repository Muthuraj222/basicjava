import java.util.Scanner;

class Evenodd {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        //which number is divisble by 2 and the remainder value is equal too 0 is even number 
        if(a%2==0)
           System.out.println("This number is even number");
        else
           System.out.println("This number is odd number");

    }
    
}
