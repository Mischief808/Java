class Meth_Exs
{
    public static void main(String args[])
    {
        String naz = new String();
        String naz1 = new String();
        naz = "John";
        naz1 = "Luther";
        System.out.println("The some of the \"String\" Methods are");
        System.out.println("This is \"Concat\" Method ");
        System.out.println(naz.concat(naz1));
        System.out.println("This is \"UPPER CASE\" Method ");
        System.out.println(naz.toUpperCase());
        System.out.println("This is \"LOWER CASE\" Method ");
        System.out.println(naz1.toLowerCase());
        System.out.println("This is \"Index-OF\" Method ");
        System.out.println(naz.indexOf("h"));
        System.out.println("This is \"Charcter-AT\" Method ");
        System.out.println(naz1.charAt(4));
        System.out.println("This is \"Contains\" Method ");
        System.out.println(naz.contains("baz"));
        System.out.println("This is \"Content - Equals \" Method ");
        System.out.println(naz1.contentEquals("Luther"));
        System.out.println("This is \"CompareTo\" Method ");
        System.out.println(naz.compareTo(naz1));
        System.out.println("This is \"CompareTo-Ignore\" Method ");
        System.out.println(naz.compareToIgnoreCase(naz1));
        System.out.println("This is \"Length\" Method ");
        System.out.println("The length of String "+naz1+" is "+naz1.length());
    }
}