class Example
{
    enum Month
    {
        January,Febuary,March,April,May,June,July,August,September,October,November,December;
    }
    public static void main(String d[])
    {
        Month[] mg = Month.values();
        for(Month m : mg)
        {
            System.out.println(m +":" +m.ordinal());
        }
        
    }
}