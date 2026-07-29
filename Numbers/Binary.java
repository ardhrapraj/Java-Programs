import java.util.Scanner;
class Binary
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String r = "";
        while(n>0)
        {
            int a = n%2;
            r = a + r;
            n = n/2;
        }
        
        
        System.out.println(r);
        
    }
}