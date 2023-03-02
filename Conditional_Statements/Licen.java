import java.util.*;

class Licen
{
    public static void main(String args[])
    { 
        Scanner ag = new Scanner(System.in);
        long age;
        System.out.println("Enter Your AGE");
        age=ag.nextLong();
        if(age>18)
        {
            System.out.println("You are eligible to apply for LMV License");
        }
        else 
        System.out.println("Your are not eligible to apply Driving License");
    }
}