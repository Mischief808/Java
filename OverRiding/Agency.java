class Electronics
{
    void show()
    {
        System.out.println("In Electronics\n");
    }
    void items()
    {
        System.out.println("Water Heaters");
        System.out.println("Air Conditioners");
        System.out.println("Fridge");
        System.out.println("Washing Machine");
    }
}
class Appliances extends Electronics
{
   void show()
   {
      System.out.println("\n\n\n\nIn Appliances\n");
   }
   void types()
   {
     System.out.println("Home Appliances");
     System.out.println("Kitchen Appliances");
     System.out.println("Utility Appliances");
     System.out.println("Gadgets");
   }
}
class Agency extends Appliances
{
    public static void main(String d[])
    {
        Electronics e = new Appliances();
        // Appliances a = new Appliances();
        // e.show();
        // a.items();
        // a.show();
        // a.types();
        e.show();
        e.items();
        
        
    }
}