import java.util.Scanner;

class GetGrade
{
    public static void main(String args[])
    {  
        int mark;
        Scanner m = new Scanner(System.in);
        System.out.println("Enter Your Mark to get your grade");
        mark=m.nextInt();
        if(mark>90)
        {
            System.out.println("Your Grade is A+");
        }
        else if(mark>80)
        {
            System.out.println("Your Grade is A");
        }
        else if(mark>70)
        {
            System.out.println("Your Grade is B");
        }
        else if(mark>60)
        {
            System.out.println("Your Grade is C");
        }
        else if(mark>50)
        {
            System.out.println("Your grade is D");
        }
        else if(mark>35)
        {
            System.out.println("Your Grade is E,You have Passed");
        }
        else if(mark<35)
        {
            System.out.println("You have Failed this time,Better Luck Next Time.....");
        }


    }
}