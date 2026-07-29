import java.util.Scanner;
class P5 
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++)
        {
            int x = 5;
            for(int j = 1;j<=(n-i)+1 ; j++)
            {

            System.out.print(x + "*");
            x--;
            }
            
            System.out.println();
        }
    }
}