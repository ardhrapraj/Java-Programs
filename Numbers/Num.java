import java.util.Scanner;
class Num
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n*n;
        boolean flag =true;
        while(n>0)
        {
            if(n%10 != s%10)
            {
                
                System.out.println("the number is not automorphic");
                flag=false;
                break;
            }
                 
            n=n/10;
            s=s/10;
        }
        if(flag)
        {
            System.out.println("the number is  automorphic");
            
        }
    }
}