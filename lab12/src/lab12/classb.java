
package lab12;
import java.util.*;

public class classb {
    public static void main(String arg[])
    {  
		try
		{
			
			int a,b;
			Scanner sc=new Scanner(System.in);
			
			
			System.out.print("Enter first number : ");
			a=sc.nextInt();
       
			System.out.print("Enter second number : ");
			b=sc.nextInt();
			
				double c1=a/b ; 
		
				System.out.println("Result:"+c1);
}
		catch(ArithmeticException e)
		{
			System.out.println("cant Divide By 0 ");
		
		}
		catch(Exception e){
			System.out.println("the input is invalid, please give integer number ");
		}
		
		System.out.println("End of Program...");
	}
}

    

