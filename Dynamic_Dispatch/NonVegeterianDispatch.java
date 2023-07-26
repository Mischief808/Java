class NonVegeterian
{
  public void display()
  {
    System.out.println("Non-Veg's show method");
  }
}
class Chicken extends NonVegeterian
{
  public void display()
  {
    System.out.println("Chicken's show method");
  }
}
class Prawn extends NonVegeterian
{
  public void display()
  {
    System.out.println("Prawn's show method");
  }
}

class NonVegeterianDispatch
{
    public static void main(String[] h)
    {
       NonVegeterian obj = new NonVegeterian();
       Chicken obj1 = new Chicken();
       Prawn obj2 = new Prawn(); 
       NonVegeterian acc;
       acc = obj;
       acc.display();
       acc = obj1;
       acc.display();
       acc = obj2;
       acc.display();

      // NonVegeterian obj = new Chicken();
      // obj.display();
       
      // NonVegeterian obj1 = (Chicken) obj;
      // obj1.display();
    }
}