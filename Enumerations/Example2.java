class Example2
{
    enum southIndia
    {
        Tamilnadu,Karnataka,Andhra,Kerala,Telangana;
    }
    public static void main(String f[])
    { 
        southIndia si = southIndia.Kerala;
        switch(si)
        {
            case Tamilnadu:
                System.out.println("This is TamilNadu");
                break;
            case Karnataka:
                System.out.println("This is karnataka");
                break;
            case Andhra:
                System.out.println("This is Andhra");
                break;
            case Kerala:
                System.out.println("This is Kerala");
                break;
            default:
                System.out.println("This is Telangana");


        }
    }
}