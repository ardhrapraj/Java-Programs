import java.util.Scanner;
class P3
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            int x = ((i-1)%5 + 1);
            for(int j = 1;j<=n ; j++)
            {
            System.out.print(x);
            }
            System.out.println();
        }
    }
}