class Bike
{
   public void info()
   {
      System.out.println("Bike is a Two-Wheeler");
   } 
   class Tyre
   {
    public void name()
    {
        System.out.println("Bike has tyres");
    }
   }
}
class InnerClass
{
    public static void main(String args[])
    {
        Bike ob = new Bike();
        ob.info();
        
        Bike.Tyre ob1 = ob.new Tyre();
        ob1.name();
    }
}