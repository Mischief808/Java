//Static block calling prog
class know
{
    
    know()
    {
        System.out.println("In \"Other-Class\" Non-Static");
    }
    static
    {
       System.out.println("In\"Other-Class\" Static \n Static Method is called automatically");
    }

}
class Block
{
    Block()
    {
        System.out.println("In \"Main-Class\" Non-Static");
    }
    static
    {
       System.out.println("In\"Main-Class\" Static \n Static Method is called automatically");
    }
    public static void main(String args[])
    {
        Block b1 = new Block(); 
        know k1 = new know();  
    }
}