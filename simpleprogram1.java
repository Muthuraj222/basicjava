import java.util.Scanner;
//print an integer entered by the user
class Simpleprogram1 
    {
        public static void main(String args[])
        {
            //In this program, an object of Scanner class, reader  is created to take inputs from standard input, which is keyboard.
            //using scanner to get input from the user
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the integer:");
            //using next int to read the next integer from the user
            //reader.nextInt()then reads all entered integers from the keyboard unless it encounters a new line character \n (Enter). The entered integers are then saved to the integer variable number.
            int num=s.nextInt();
            //If you enter any character which is not an integer, the compiler will throw an InputMismatchException.
            System.out.println("You entered" + num);
        }
    }

    

