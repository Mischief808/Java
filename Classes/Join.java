class Operation
{
    int add(int j1,int j2)
    {
        int res=j1+j2;
        return res;
    }
}
class Join
{
    public static void main(String args[])
    {
        int k=6;
        int l=8;
        Operation tn = new Operation();
        System.out.println("The addition of "+k+"and"+l+"is"+tn.add(k,l));

    }
}