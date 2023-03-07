import java.io.*;
class TextInp1
{
    public static void main(String args[])
    { 
        String Color;
        Console get = System.console();
        System.out.println("What's Your favourite Color");
        Color = get.readLine();
        System.out.println("We will provide you a "+Color+" Color Shirt");
               
    }
}
