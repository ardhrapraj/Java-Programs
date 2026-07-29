import java.util.Scanner;
class P2
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            
            if(i%2!=0)
            {
                int x = 1;
                for(int j =1;j<=n;j++)
                {
                    System.out.print(x);
                    x++;
                }
            }
            else
            {
                int y =5;
                for(int j =1;j<=n;j++)
                {
                    System.out.print(y);
                    y--;
                }
            }
            System.out.println();
        }
    }
}