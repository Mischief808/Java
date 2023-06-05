interface Material
{
    void info();
}
class Bricks implements Material
{
    public void info()
    {
        System.out.println("This is Bricks class");
    }
}
class Sand implements Material
{
    public void info()
    {
        System.out.println("This is Sand class");
    }
}
class Acces
{
    public void getMater(Material bri)
    {
        bri.info();
    }
}
class Materials
{
    public static void main(String[] args)
    { 
        Material obj = new Bricks();
        Material  obj1 = new Sand();

        Acces dud = new Acces();
        dud.getMater(obj);
        dud.getMater(obj1);
    }
}