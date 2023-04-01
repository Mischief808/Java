class NonVegeterian
{
  public void display()
  {
    System.out.println("Non-Veg Show Method");
  }
}
class Chicken extends NonVegeterian
{
  public void display()
  {
    System.out.println("Chicken's Show Method");
  }
}
class Prawn extends NonVegeterian
{
  public void display()
  {
    System.out.println("Prawn's Show Method");
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
       acc.();
       acc = obj2;
       acc.show();
    }
}