import java.util.*;
class Example2
{
    enum southIndia
    {
        TAMILNADU("Tamil"),KARNATAKA("Kannada"),ANDHRA("Telugu"),KERALA("Malayalam"),TELANGANA("Telugu");
        private String value;
        southIndia(String value)
        {
            this.value = value;
        }
        public String getvalue()
        {
            return value;
        }
    }
    public static void main(String f[])
    { 
        southIndia si = southIndia.KERALA;
        System.out.println("ENUM Name : " +si.name());
        System.out.println("ENUM Value : " +si.getvalue());
        for(southIndia so : southIndia.values())
        {
            System.out.println("Name : " +so.name());
            System.out.println("Value : " +so.getvalue());
        }
        
        switch(si)
        {
            case TAMILNADU:
                System.out.println("This is TamilNadu");
                break;
            case KARNATAKA:
                System.out.println("This is karnataka");
                break;
            case ANDHRA:
                System.out.println("This is Andhra");
                break;
            case KERALA:
                System.out.println("This is Kerala");
                break;
            default:
                System.out.println("This is Telangana");


        }
    }
}