import java.util.*;
class Input
{
    public static void main(String args[])
    { 
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of Array");
        n = inp.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++)
        {
            array[i] = inp.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i] + " ");
        }

    }
}