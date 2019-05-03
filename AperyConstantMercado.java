  import java.util.*;
  public class AperyConstantMercado {
   public static double calcApery(int n) {
    if(n==1) // base case
     return 1;
    else
     return (1/(Math.pow(n, 3)) +calcApery(n-1));
   }
    public static void main(String[] args) {
     try {
     Scanner input=new Scanner(System.in);
    
     System.out.println("Please enter a positive number!");
     int n = input.nextInt();
     
    if(n==1)
     System.out.printf(" Apery(%d) = %d\n",n,(int)calcApery(n)); // print the base case as an integer
    else
     System.out.printf(" Apery(%d)= %.20f\n",n,calcApery(n));
    
    input.close();
    }catch (Exception e) { 
     System.out.print("Characters are not allowed!");
     }
    }
  }
  
