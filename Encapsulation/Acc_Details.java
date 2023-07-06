class Details
{
    private long acc_no;
    private String name;
    private double amount;
    void setAccNo(long acc_no)
    {
        this.acc_no = acc_no;
    }
    long getAccNo()
    {
        return acc_no;
    }
    void setName(String name)
    {
        this.name = name;
    }
    String getName()
    {
        return name;
    }
    void setAmount(double amount)
    {
        this.amount = amount;
    }
    double getAmount()
    {
        return amount;
    }
}
class Acc_Details
{
    public static void main(String[] g)
    {
         Details d = new Details();
         d.setAccNo(1491939660);
         d.setName("Christopher");
         d.setAmount(40000);
         System.out.println("Name : " +d.getName()+ "Account-No : " +d.getAccNo()+ "Amount : " +d.getAmount());
    }
}