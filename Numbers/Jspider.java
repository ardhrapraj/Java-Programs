import java.util.Scanner;
class Jspider
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
    
      
        while(n>0){
      
        
            
           
            int a = n%10;
            sum = sum+a;
             n = n/10;
             if(n==0 && sum>9)
             {
                System.out.println(sum);
                n = sum;
                sum = 0;
             }
             
        
      
        }
        if(sum == 1)
        {
        System.out.println(sum);
        }
        else{
            System.out.println("not one");
        }
         
       
      }
        
    
}

