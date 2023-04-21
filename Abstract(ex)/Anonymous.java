abstract class Car
{
   abstract public void info();
}

class Anonymous
{
  public static void main(String args[])
  {
    Car obj = new Car()
    {
        public void info()
        {
            System.out.println("This is car-class");
        }
    };
    obj.info();
  }
}