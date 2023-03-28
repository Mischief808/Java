import vehicle.*;
class B extends Bike
{ 
    public void show()
    {
        display();
    }
}
class AccessVehicle 
{
    public static void main(String args[])
    {
       Car c = new Car();
       B obj = new B();
       SuperBike sb = new SuperBike();
       c.show();
       obj.show();
       sb.disp();
    }
}
