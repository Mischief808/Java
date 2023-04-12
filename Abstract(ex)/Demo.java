abstract class Clothes
{
    abstract public void MenCloths();
    abstract public void WomenCloths();
}
class Collections extends Clothes
{
    public void MenCloths()
    {
        System.out.println("This is Men's Clothes collections");
        System.out.println("\t \tShirts");
        System.out.println("\t \tPants");
        System.out.println("\t \tCoat Suits");
    }
    public void WomenCloths()
    {
        System.out.println("This is Women's Clothes collections");
        System.out.println("\t \tSarees");
        System.out.println("\t \tSalwar's");
        System.out.println("\t \tHalf Sarees");
        
    }
    
}
class Demo 
{
    public static void main(String args[])
    {
            Clothes ob = new Collections();
            ob.MenCloths();
            ob.WomenCloths();
    }    
}
