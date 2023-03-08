import java.util.*;
class Ternar
{
    public static void main(String args[])
    {
        int age;
        String res;
        Scanner ag = new Scanner(System.in);
        System.out.println("Enter your age");
        age = ag.nextInt();
        res = age<=18 ? "You are not eligible to vote" : "You are eligible to vote" ;
        System.out.println(res);
    }
}