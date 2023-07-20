class Vehicle
{
  void cc()
  {
    System.out.println("vehicles cc depends on whether it 2-wheeler or 4-wheeler ");
  }
}
class Bike extends vehicle
{
   void cc()
   {
    System.out.println("Bike's minimum cc is 100cc");
   }
}
class Car extends vehicle
{
   void cc()
   {
    System.out.println("Car's minimum cc is above 800 cc");
   }
}
class DemoCaBk
{
    public static void main(String a[])
    {
    Bike b = new Bike();
    Car c = new Car();
    b.cc();
    c.cc();
    }
    
}