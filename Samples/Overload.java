import java.util.*;
class Fun
{
    int add(int a1,int a2)
    {
    //   Scanner inp = new Scanner(System.in); 
    //   System.out.println("Enter Numbers to add");
    //   a1 = inp.nextInt();
    //   a2 = inp.nextInt();
      return a1+a2; 
    }
    int add(int a1,int a2,int a3)
    {
        // Scanner inp = new Scanner(System.in);
        // System.out.println("Enter Numbers to add");
        // b1 = inp.nextInt();
        // b2 = inp.nextInt();
        // b3 = inp.nextInt();
        return a1+a2+a3;
    }
}
class Overload 
{
    public static void main(String args[])
    {
        Fun f = new Fun();
        System.out.println(f.add(7,8));
        System.out.println(f.add(23,43,56));
        
    }
    
}
