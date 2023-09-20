class Wloop
{
    public static void main(String args[])
    {
        int i=1;
        while(i<=5)// while consists of true or false
        {
            System.out.println("hi " + i);
            int j=0;
            while(j<=4)
            {
                System.out.println("bye " + j);
                j++;
            }
            i++;
        }
    }
}