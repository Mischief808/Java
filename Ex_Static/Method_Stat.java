import java.util.*;
// class MathFunctions
// {
//     static int add(int a, int b)
//     {
//         return a+b;
//     }
//     static int sub(int a, int b)
//     {
//         return a-b;
//     }
//     static int mul(int a, int b)
//     {
//         return a*b;
//     }
//     static int div(int a, int b)
//     {
//         return a/b;
//     }
// }
class Method_Stat
{
    static int add(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int mul(int a, int b)
    {
        return a*b;
    }
    static int div(int a, int b)
    {
        return a/b;
    }
    public static void main(String[] d)
    {
       Scanner inp = new Scanner(System.in);
       int a,b;
       System.out.println("Enter a and b to perform operations");
       a = inp.nextInt();
       b = inp.nextInt();
       System.out.println("The Addition of "+a+ " and " +b+ " is " +add(a,b));
       if(a>b){
       System.out.println("The Subtraction of "+a+ " and " +b+ " is " +sub(a,b));
       System.out.println("The Divsion of " +a+ " and " +b+ " is " +div(a,b));
       }
       else
       System.out.println("As " +a+ " is lesser than " +b+ " Subtraction and Division are not performed");
       System.out.println("The Multiplication of "+a+ " and " +b+ " is " +mul(a,b));
        
    }
}
