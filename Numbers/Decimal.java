import java.util.Scanner;
class Decimal
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        int sum = 0;
        while(n>0)
        {
            int a = n%10;
            sum = sum +(prod * a);
            n = n/10;
            prod = prod * 2;
        }
        
        
        System.out.println(sum);
        
    }
}