interface Material
{
    void info();
}
class Bricks implements Material
{
    public void info()
    {
        System.out.println("This is Bricks Class");
    }
}
class Sand implements Material
{
    public void info()
    {
        System.out.println("This is Sand Class");
    }
}
class Access
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
        Material bri = new Bricks();
        Material  san = new Sand();
        Access dud = new Access();
        dud.getMater(bri);
        dud.getMater(san);
    }
}