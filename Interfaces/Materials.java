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

class Acces
{
    public void getMat(Material bri)
    {
        bri.info();
    }
}
class Materials
{
    public static void main(String args[])
    { 
        Material bri = new Bricks();

        Acces dud = new Acces();
        dud.getMat(bri);
    }
}