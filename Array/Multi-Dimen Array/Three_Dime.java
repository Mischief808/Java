import java.util.*;
class Three_Dime
{
    public static void main(String args[])
    {
        Scanner ge = new Scanner(System.in);
        int f,g,h,i,j,k;
        System.out.println("Enter the size of 3-D Array");
        f = ge.nextInt();
        g = ge.nextInt();
        h = ge.nextInt();
        int[][][] has = new int[f][g][h];
        for(i=0;i<f;i++)
        {
            for(j=0;j<g;j++)
            {
                for(k=0;k<h;k++)
                {
                    has[i][j][k] = (int)(Math.random()*10);
                }
            }
        }
        for(i=0;i<f;i++)
        {
            for(j=0;j<g;j++)
            {
                for(k=0;k<h;k++)
                {
                    System.out.print(has[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        // for(int a[][]:has)
        // {
        //     for(int b[]:a)
        //     {
        //         for(int c:b)
        //         {
        //             System.out.println(c + " ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }

    }
}