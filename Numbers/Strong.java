import java.util.Scanner;
class Strong
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a; i<= b;i++)
        {

        
        int n = i;
        int sum = 0;
        while(n>0)
        {
            int c = n%10;
            int fact = 1;
            for(int j = 1;j<=c;j++)
            {
            fact *= j;
            }
            sum = sum + fact;
            n = n/10;
            
        }
        if(sum==i)
        {
            System.out.println(i);
        }
        }
    }
}
