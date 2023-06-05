interface Material
{
    void info();
}
class Bricks implements Material
{
    public void info()
    {
        System.out.println("This is Bricks");
    }
}
class Sand implements Material
{
    public void info()
    {
        System.out.println("This is Sand");
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
        Material bri = new Bricks();
        Material  san = new Sand();

        Acces dud = new Acces();
        dud.getMater(bri);
        dud.getMater(san);
    }
}