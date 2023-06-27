class NonVegeterian
{
  public void display()
  {
    System.out.println("Show Method in Non-Veg");
  }
}
class Chicken extends NonVegeterian
{
  public void display()
  {
    System.out.println("Show Method in Chicken");
  }
}
class Prawn extends NonVegeterian
{
  public void display()
  {
    System.out.println("Show Method in Prawn");
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