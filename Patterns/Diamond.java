import java.util.Scanner;
class Diamond
{
    public static void main(String[] args)
    {
        System.out.println("enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = n/2;
        int stars = 1;
        for ( int i =1;i<=n;i++)
        {
            for(int j = 1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=stars;j++)
            {
                if(i==n || j==stars || j==1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
                    
                
            }
        System.out.println();
        if(i <= n/2)
        {
            spaces--;
            stars += 2;
        }
        else{
            spaces++;
            stars -= 2;
        }
        }
        
    }
}