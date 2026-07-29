import java.util.Scanner;
class P6 
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = 30;
        int star = 1;
        for(int i = 1;i<=n;i++)
        {
            
            for(int j = 1;j<=spaces ; j++)
            {

            System.out.print(" ");
            
            }
            for(int j = 1;j<=star ; j++)
            {

            System.out.print("*");
            }
            

            
            System.out.println();
            spaces--;
            star += 2;
        }
    }
}