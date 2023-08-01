class A
{
 A()
 {
    System.out.println("A's constructor");
 }
 A(int n)
 {  
    System.out.println("A's int constructor");
 }
}
class B extends A
{
 B()
 {
    System.out.println("B's constrcutor");
 }
 B(int n)
 { 
   super(n); //calling parent class Constructor
    System.out.println("B's int constructor");
 }
}
class Construct
{
    public static void main(String args[])
    {
      A ob = new B();
      B ob1 = new B(5); 

    }
}
 