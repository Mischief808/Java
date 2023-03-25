class Demo
{
    void ob()
    {
        System.out.println("In static void ob(Demo)");
    }
    void ts()
    {
        System.out.println("In Demo TS");
    }
}
class Another extends Demo
{
    void ob()
    {
        System.out.println("In Static void ob(Another)");
    }
    void ts()
    {
        System.out.println("In Another TS");
    }
}
class Run extends Another
{
    public static void main(String f[])
    {
       Demo d = new Another();
       d.ob();
       d.ts(); 
         
    }
}