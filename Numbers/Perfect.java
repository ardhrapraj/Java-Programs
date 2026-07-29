import java.util.Scanner;
class Perfect
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i = a;i<=b;i++)
        {
            int n = i;
            int sum = 0;
        for(int j = 1;j<n;j++)
        {
            if(n%j==0)
            {
                sum = sum+j;
            }
        }
        if(sum==n)
        {
            System.out.println(i);
        }
        }
    }
}
