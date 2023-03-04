import java.util.*;
class TextInp
{
    public static void main(String args[])
    { 
        Scanner tx = new Scanner(System.in);
        String text;
        System.out.println("Enter the string");
        text = tx.nextLine();
        if(text.length() <= 10)
        {
            System.out.println("Please Enter Maximum 10 Strings");
            text = tx.nextLine();
        } 
            System.out.println("The Given String is "+text);

    }
}