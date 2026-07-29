import java.util.Scanner;
class Number
{
    public static void main(String[] args)
    {
        System.out.println("enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = n-1;
        
        for ( int i =1;i<=n;i++)
        {
            for(int j = 1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
                
                    System.out.print(j);
            }
            for(int j = i-1;j>=1;j--)
            {
                System.out.print(j);
            }
                
                    
                
        
        System.out.println();
        spaces --;
        }
        }
        
    }
