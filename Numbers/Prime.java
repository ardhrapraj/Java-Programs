import java.util.Scanner;
class Prime
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 2;i<=n/2;i++)
        {
            if(n%i == 0)
            {
                flag = false;
                break;
            }
            
         }
        if(n>=2 && flag == true)
        {
            System.out.println("the number is a  prime");
            
        }
        else
        {
            System.out.println("the number is not a prime");
            
        }
            
        
    }   
}