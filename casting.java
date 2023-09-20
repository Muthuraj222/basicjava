class Casting{
    public static void main(String args[])
    {
        //conversion
        byte a=127;
        int b=a;
        System.out.println(a);
        //casting
        int c=25;
        byte d=(byte)c;
        System.out.println(d);
        //casting in float
        float e=3.6f;
        int f=(int)e;
        System.out.println(f);
        //type promotion
        byte x=10;
        byte y=20;
        int z= x*y;
        int v=x+y;
        int i=x%y;
        System.out.println(z);
        System.out.println(v);
        System.out.println(i);
        //modulo large value or greater range can be stored in bytes
        int j=256;
        byte k=(byte)j;
        System.out.println(k);
    }

}