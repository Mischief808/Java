import java.util.*;
class Divide
{ 
    void disp()
    {
        System.out.println("G is less than h");
    }
    int div(int a,int b)
    {
        int res = b /a;
        return res;

    }
}
class Ifels
{
    public static void main(String args[])
    {  
        Divide br = new Divide();
        Scanner a = new Scanner(System.in);
        int res;
        int g,h;
        System.out.println("Enter g and h ");
        g=a.nextInt();
        h=a.nextInt();
        if(g>h)
        {
            System.out.println("h should be greater than g");
        }
        else
        System.out.println(br.div(g,h));
    }
}