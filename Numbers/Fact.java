import java.util.Scanner;
class Fact
{
    public static void main(String[] args)
    {
        System.out.println("enter the num");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Fact = 1;
        for(int i = 1;i<=n;i++)
        {
            Fact *= i;
        }
        System.out.println(Fact);
    }
}