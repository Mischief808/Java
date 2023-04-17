class Example3
{
    enum Seasons
    {
        summer,winter,spring,fall;
    }
    public static void main(String f[])
    {
        Seasons s = Seasons.summer;
        if(s == Seasons.summer)
        {
            System.out.println("Too hot");
        }
        if(s == Seasons.winter)
        {
            System.out.println("Too Cold");
        }
        if(s == Seasons.spring)
        {
            System.out.println("Muddiest Season");
        }
        if(s == Seasons.fall)
        {
            System.out.println("Rising natures");
        }
    }
}