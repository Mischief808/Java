import java.util.*;
class Opera
{
    int Mult(int r1,int r2)
    {
        int res=r1*r2;
        return res;
    }
}
class Join1
{
    public static void main(String args[])
    {
        Scanner get = new Scanner(System.in);
        Opera t = new Opera();
        int m,n;
        System.out.println("Enter Two Numbers to Multiply");
        m=get.nextInt();
        n=get.nextInt();
        System.out.println("The result is "+t.Mult(m,n));

    }
}