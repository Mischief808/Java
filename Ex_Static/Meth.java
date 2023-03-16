//using Static variables,way of accessing static variables.
import java.util.*;
class call
{
    // Scanner inp = new Scanner(System.in);
    static long rollno;
    static String Subject;
    int marks;
     
    void disp()
    {
        // System.out.println("To Know Your Marks \n Enter your Roll-No : ");
        // rollno = inp.nextInt();
        System.out.println("Subject : "+Subject+ "\nRoll-No : " +rollno+ "\nMark : " +marks+ "\n");
    }
}
class Meth
{
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        call c1 = new call();
        c1.marks = 86;

        call c2 = new call();
        c2.marks = 74;

        call c3 = new call();
        c3.marks = 93;

        call.Subject = "Accountancy";

        System.out.println("To Know Your Marks \n Enter your Roll-No : ");
        call.rollno = inp.nextLong();

        if(call.rollno == 1911301)
        {
            c1.disp();
        }
        else if(call.rollno == 1911302)
        {
            c2.disp();
        }
        else if(call.rollno == 1911303)
        {
            c3.disp();
        }
        else 
        {
            System.out.println("Enter correct Roll-no To get Your Marks");
        }
    }
}