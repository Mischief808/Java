class Example
{
    enum Month
    {
        // January,Febuary,March,April,May,June,July,August,September,October,November,December;
        January(1),Febuary(2),March(3),April(4),May(5),June(6),July(7),August(8),September(9),October(10),November(11),December(12);
        private int num;
        private Month(int num)
        {
            this.num = num;
        }
        void setNum(int num)
        {
            this.num = num;
        }
        int getNum()
        {
           return num;
        }
    }
    public static void main(String d[])
    {
        // Month[] mg = Month.values();
        // Month mg1 = Month.January;
        // System.out.println(mg1+ ":" +mg1.getNum());

        // Using For-Each
        for(Month mg:Month.values())
        {
            System.out.println(mg + " : " +mg.getNum());
        }
        // for(Month m : mg)
        // {
        //     System.out.println(m +":" +m.ordinal());
        // }
        
    }
}