import java.util.Scanner;
class Armstrong
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int len = 0;
        while(n>0)
        {
            len++;
            n = n/10;
        }
        n = num;
        int sum = 0;
        while(n>0)
        {
            int a = n%10;
            int prod = 1;
            for(int i = 1;i<=len;i++)
            {
                prod*=a;
            }
            sum += prod;
            n = n/10;
            
        }
        if(sum == num)
        {
            System.out.println("its an armstrong");
        }
        else{
             System.out.println("its not an armstrong");
        }
    }
}