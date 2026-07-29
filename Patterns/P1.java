import java.util.Scanner;
class P1
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            int x = 1;
            if(i%2!=0)
            {
                
                for(int j =1;j<=n;j++)
                {
                    System.out.print(x);
                    x++;
                }
            }
            else
            {
                for(int j =1;j<=n;j++)
                {
                    System.out.print(x);
                    x++;
                }
            }
            System.out.println();
        }
    }
}