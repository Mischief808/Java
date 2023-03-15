
class StringBufferExample6
{
    public static void main(String[] c)
    {
        StringBuffer ja = new StringBuffer("Hi Everyone....");
        System.out.println(ja.capacity());
        ja.ensureCapacity(35);
        System.out.println(ja.capacity());

    }
}