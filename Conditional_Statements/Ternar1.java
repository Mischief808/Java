import java.util.*;
class Ternar1
{
    public static void main(String args[])
    {
        Scanner inp=new Scanner(System.in);
        int a,b,res;
        System.out.println("Enter a and b");
        a=inp.nextInt();
        b=inp.nextInt();
        res = a>b ? a/b : a%b; 
        System.out.println("The result is "+res);
    }
}