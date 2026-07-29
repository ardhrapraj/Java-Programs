import java.util.Scanner;
class Gcd
{
    public static void main(String[] args)
    {
        System.out.println("enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = a<b?a:b;
        
        while(true)
        {
            if(a%n == 0 && b%n == 0)
            {
                break;
            }
            n--;
        }
        System.out.println(n);
    }   
}