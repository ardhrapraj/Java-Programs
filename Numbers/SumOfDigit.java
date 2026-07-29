import java.util.Scanner;
class SumOfDigit
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
    
      while(n>9){
        while(n>0){
      
        
            
           
            
            sum = sum+n%10;
             n = n/10;
        
      
        }
         n=sum;
       sum=0;
       
      }
        System.out.println(n);
    
}
}
