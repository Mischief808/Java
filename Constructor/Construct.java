class A
{
 A()
 {
    System.out.println("In A");
 }
 A(int n)
 { 
    
    System.out.println("In A(int)");
 }
}
class B extends A
{
 B()
 {
    System.out.println("In B");
 }
 B(int n)
 {
    System.out.println("In B(int)");
 }
}
class Construct
{
    public static void main(String args[])
    {
       A ob = new A();
       B ob1 = new B();
       
    }
}
