import java.util.*;

class Lowestof3nos
{
    public static void main(String args[]) 
    { 
        Scanner no = new Scanner(System.in);
        double p,q,r;
        System.out.println("Enter Three numbers p,q,r");
        p=no.nextDouble();
        q=no.nextDouble();
        r=no.nextDouble();
        if(p<q && p<r)
        {
            System.out.println(p+" is Lowest number");
        }
        else if(q<r && q<p)
        {
            System.out.println(q+" is Lowest number");
        }
        else 
        System.out.println(r+" is Lowest number");
        
    }
}