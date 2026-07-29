class D
{
    public static void m1()
    {
        System.out.println("m1 executed in D");
    }
    public static void main(String[] args)
    {
        System.out.println("main executed");
        D.m1();
        
    }
}