import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        
        for(int i = a;i<=b;i++)
        {
            int r = 0;
            int num = i;
        while(num>0)
        {
            int c = num%10;
            r = (r*10) + c;
            num = num/10;
        }
        
        if (r == i)
        {
            System.out.println(i);
        }
        
        }
        
    }
}