class Buffer
{
    public static void main(String[] b)
    {
       StringBuffer gh = new StringBuffer("Mathew");
       gh.append(" Wade");
       System.out.println(gh);
       System.out.println(gh.capacity());
       System.out.println(gh.insert(11," is a trainer "));
       System.out.println(gh.replace(0,11,"Michael Hussey"));
       System.out.println(gh.delete(18,20));
       System.out.println(gh.reverse());
      
    //    StringBuffer d  = new StringBuffer("Hi this is me dggqy echsS");
    //    d.setLength(36);
    //    System.out.println(d.capacity());
    //    System.out.print(d.length());
        
    }
}