class Dat
{
    private int age;
    void setAge(int age)
    {
        this.age = age;
    }
    int getAge()
    {
        return age;
    }
} 
class Encaps
{
   public static void main(String args[])
   {
     Dat ob = new Dat();
     ob.setAge(19);
     System.out.println(ob.getAge());
   }
}