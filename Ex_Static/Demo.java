// Example of Static Method
class Demo1
{
    static void MyMetho()
    {
        System.out.println("This is a Static Method");
    }
    void MyMetho1()
    {
        System.out.println("This is a non-Static Method");
    }
}
class Demo
{
    public static void main(String[] k)
    {
        Demo1.MyMetho();
        Demo1 m = new Demo1();
        m.MyMetho1();
    }

}