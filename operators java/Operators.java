class Operators{
    public static void main(String args[])
    {
        int x=12;
        int y=3;
        int a=23;
        int b=4;
        // relational operators <,>,>=,<=,(!=not equal (Not=!))
        boolean c=x>y;
        //arithmetic operators +,-,%,*,\
        int d=x+b;
        System.out.println(d);
        //logical operators And=&, OR=| Not=!
        // && short socket used to reduce the time of programe running 
        boolean e=x>y && a<b;
        boolean f=x>y || a<b;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(c);

    }
}