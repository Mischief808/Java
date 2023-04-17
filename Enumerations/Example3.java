class Example3
{
    enum Seasons
    {
        summer,winter,spring,fall;
    }
    public static void main(String f[])
    {
        Seasons s = Seasons.winter;
        if(s == Seasons.summer)
        {
            System.out.println("Too hot");
        }
        else if(s == Seasons.winter)
        {
            System.out.println("Too Cold");
        }
        else if(s == Seasons.spring)
        {
            System.out.println("Muddiest Season");
        }
        else if(s == Seasons.fall)
        {
            System.out.println("Rising natures");
        }
    }
}