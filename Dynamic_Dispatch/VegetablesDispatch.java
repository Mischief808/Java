class Vegetable
{
    public void disp()
    {
        System.out.println("Vegetables's Display Method");
    }
}
class Carrot extends Vegetable
{
    public void disp()
    {
        System.out.println("Carrots's Display Method");
    }
}
class Beans extends Vegetable
{
 public void disp()
 {
    System.out.println("Bean's Display Method");
 }
}
class VegetablesDispatch
{
    public static void main(String args[])
    {
        Vegetable v = new Vegetable();
        v.disp();
        v = new Carrot();
        v.disp();
        v = new Beans();
        v.disp();
    }
}
