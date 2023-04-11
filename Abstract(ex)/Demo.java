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
        System.out.println("Sarees");
        System.out.println("Salwar's");
        System.out.println("Half Sarees");
        
    }
    
}
class Demo 
{
    public static void main(String args[])
    {
            Clothes ob = new Collections();
            ob.MenCloths();
    }    
}
