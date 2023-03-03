class Mult
{
    void mul()//(int r1,int r2)
    { 
        // int res = r1*r2;
        // return res;
        System.out.println("In Mult");

    }
}
class CallClass 
{
  public static void main (String args[])
  {
    int p=5;
    int q=7;
    Mult m = new Mult();
    m.mul(); 

  }   
    
}
