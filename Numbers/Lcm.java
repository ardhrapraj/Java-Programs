import java.util.Scanner;
class Lcm
{
    public static void main(String[] args)
    {
        System.out.println("enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = a>b?a:b;
        int i = n;
        while(true)
        {
            if(n%a == 0 && n%b == 0)
            {
                break;
            }
            n += i;
        }
        System.out.println(n);
    }   
}