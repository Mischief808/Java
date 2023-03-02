import java.util.Scanner;

class Largestof3nos
{
    public static void main(String args[])
    {
        Scanner no=new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter Three numbers a,b,c");
        a=no.nextDouble();
        b=no.nextDouble();
        c=no.nextDouble();
        if(a>b && a>c)
        {
            System.out.println(a+"is greater than b&c");
        }
        else if(b>c)
        {
            System.out.println(b+"is graeter than a&c");
        }
        else 
           System.out.println(c+"is greater than b&a");

    }
}