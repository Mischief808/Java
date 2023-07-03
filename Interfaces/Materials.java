interface Material
{
    void info();
}
class Bricks implements Material
{
    public void info()
    {
        System.out.println("Bricks Class");
    }
}
class Sand implements Material
{
    public void info()
    {
        System.out.println("Sand Class");
    }
}
class Acces
{
    public void getMater(Material br)
    {
        br.info();
    }
}
class Materials
{
    public static void main(String[] args)
    { 
        Material br = new Bricks();
        Material  sn = new Sand();

        Acces du = new Acces();
        du.getMater(br);
        du.getMater(sn);
    }
}