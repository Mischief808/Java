import java.util.*;
class Compo
{
   void playGuitar()
   {
      System.out.println("Playing Guitar.....");
   } 
   String GetMeBall(int cost)
   { 
       Scanner inp = new Scanner(System.in);
       System.out.println("Enter the cost");
       cost = inp.nextInt();
       if(cost>=40)
       return "Take Your Ball";
       else 
       return "Nothing";
   }
} 
class Meth
{
    public static void main(String args[])
    {
        System.out.println("Hi,Welcome....");
        Compo cmp = new Compo();
        cmp.playGuitar();
        String str = cmp.GetMeBall(30);
        System.out.println(str);
        

    }
}