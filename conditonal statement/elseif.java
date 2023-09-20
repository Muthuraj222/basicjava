class Elseif {
    public static void main(String args[])
    {
        //three condition we use else if 
        int x=10;
        int y=20;
        int z=30;
        //x>y is one condition x>z is another condition 
        //we use logical operation and(&&) to combine to condition 
        if(x>y && x>z)
          System.out.println("X is smaller than all other");
        else if(y>x && y>z)
          System.out.println("Y is smaller than all other");
        else 
          System.out.println("Z is greater than all other");
    }
    
}
