import java.util.*;

class SampleIf
{
    public static void main(String args[]) 
    {
       int a,b;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter A and B");
       a=s.nextInt();
       b=s.nextInt();
    // int a=9;
    // int b=7;
       if(a>b)
       {
        System.out.println("A is greater than B");
       }
       else
        System.out.println("B is greater");
    }
}
