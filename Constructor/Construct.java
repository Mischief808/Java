class A
{
 A()
 {
    System.out.println("In A con");
 }
 A(int n)
 {  
    System.out.println("In A int con");
 }
}
class B extends A
{
 B()
 {
    System.out.println("In B con ");
 }
 B(int n)
 { 
    System.out.println("In B int con");
 }
}
class Construct
{
    public static void main(String args[])
    {
         
      B ob1 = new B(6); 

    }
}
 