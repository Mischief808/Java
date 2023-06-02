class A
{
 A()
 {
    System.out.println("In A constructor");
 }
 A(int n)
 {  
    System.out.println("In A int constructor");
 }
}
class B extends A
{
 B()
 {
    System.out.println("In B constrcutor");
 }
 B(int n)
 { 
   super(n); //calling parent class Constructor
    System.out.println("In B int constructor");
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
 