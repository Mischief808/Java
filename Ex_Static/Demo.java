// Example of Static Method
class Demo1
{
    static void MyMeth()
    {
        System.out.println("Static Method");
    }
    void MyMeth1()
    {
        System.out.println("Non-Static Method");
    }
}
class Demo
{
    public static void main(String[] k)
    {
        Demo1.MyMeth();
        Demo1 m = new Demo1();
        m.MyMeth1();
    }
}
