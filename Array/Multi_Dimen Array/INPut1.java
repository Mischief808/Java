import java.util.*;
class INPut1
{
    public static void main(String args[])
    {
       Scanner inp = new Scanner(System.in);
       int i,j,d,e;
       System.out.println("Enter size of an 2-D Array ");
       d=inp.nextInt();
       e=inp.nextInt();
       System.out.println("Enter the elements of an array");
       int[][] baz = new int[d][e];
       for(i=0;i<d;i++)
       {
        for(j=0;j<e;j++)
        {
           baz[i][j] = inp.nextInt();
        }
       }
       for(i=0;i<d;i++)
       {
        for(j=0;j<e;j++)
        {
            System.out.print(baz[i][j] + " ");
        }
        System.out.println();
       }
    }
}