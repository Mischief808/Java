class Student
{
    String name;
    int rollno;
    int marks;
    void show()
    {
        System.out.println("Roll No of " +name+" is "+rollno);
        System.out.println("Here is your marks");
        System.out.println(name + ":" + marks);
    }
}
class Back
{
  public static void main(String a[]) 
  {
    Student s1 = new Student();
    s1.name = "Jack";
    s1.marks = 78;
    s1.rollno = 101;

    Student s2 = new Student();
    s2.name = "Willey";
    s2.marks = 85;
    s2.rollno = 102;
       
    Student s3 = new Student();
    s3.name = "David";
    s3.marks = 92;
    s3.rollno = 103;
    System.out.println(s1.name + ":" + s1.marks);
    s2.show();
    s3.show();
  }
}