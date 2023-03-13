import java.util.*;
class Input
{
    public static void main(String args[])
    { 
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of Array");
        n = inp.nextInt();
        int[] item = new int[n];
        for(int i=0;i<n;i++)
        {
            item[i] = inp.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(item[i] + " ");
        }

    }
}   