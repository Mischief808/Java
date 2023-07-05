class Data
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
     Dat obj = new Dat();
     obj.setAge(19);
     System.out.println("Age is " +obj.getAge());
   }
}