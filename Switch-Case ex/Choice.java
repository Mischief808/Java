import java.util.*;
class Choice 
{
   public static void main(String args[])
   {
      Scanner inp = new Scanner(System.in);
      int ch;
      System.out.println("Enter Your Choice");
      ch=inp.nextInt();
      switch(ch)
      {
         case 1:
              System.out.println("Your choice is 1");
              System.out.println("Have a Nice Day");
              break;
         case 2:
              System.out.println("Your Choice is 2");
              System.out.println("Have a Nice day");
              break;
         case 3:
               System.out.println("Your Choice is 3");
               System.out.println("Have a Nice Day");
               break;
         default:
               System.out.println("You Have Entered a wrong Choice");


      }

      

   }   
}