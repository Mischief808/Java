import java.util.*;
class ExFor
{
   public static void main(String args[])
   {
     Scanner inp = new Scanner(System.in);
     int i,k;
     System.out.println("Enter number get mutiples of it");
     k = inp.nextInt();
     System.out.println("Multiples of "+k+" are");
     for(i=0;i<=100;i=i+k)
     { 
        System.out.println(+k+ "*" +(i/k)+ " =" +i);                
     }

   }   
}