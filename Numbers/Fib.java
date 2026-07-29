import java.util.Scanner;
class Fib
{
    public static void main(String[] args)
    {
        System.out.println("enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        
        int b = 1;
        
        while(a<=n)
        {
            System.out.println(a);
            
            int c = a+b;
            
            a = b;
            b = c;
            
        }
    }
}