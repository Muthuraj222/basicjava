class Switch
{
    public static void main(String args[])
    {
        //In normal we want to print 7 days of weeks we use else if
        //int a=2;
        //if(a==1)
        //    System.out.println("sunday");
        // else if(a==2);
        //    System.out.println("Monday");
        // else if(a==3);
        //    System.out.println("Tuesday");
        //else if(a==4);
        //    System.out.println("Wednesday");
        //else if(a==5);
        //    System.out.println("Thursday");
        //else if(a==6);
        //    System.out.println("Friday");
        //else if(a==7);
        //    System.out.println("Saturday");
        // output: Monday
        // But in switch statement we use switch keyword
        int a=1;
        switch(a)
        {
            case 1:
              System.out.println("Sunday");
              break;
            case 2:
              System.out.println("Monday");
              break;
            case 3:
              System.out.println("Tuesday");
              break;
            case 4:
              System.out.println("wednesday");
              break;
            case 5:
              System.out.println("Thursday");
              break;
            case 6:
              System.out.println("friday");
              break;
            case 7:
            System.out.println("Saturday");
            break;
        }
    }  
}