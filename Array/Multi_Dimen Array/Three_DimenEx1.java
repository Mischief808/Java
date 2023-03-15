class Three_DimenEx1
{
    public static void main(String args[])
    {
        int[][][] gab = new int[2][4][5];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<5;k++)
                {
                    gab[i][j][k] = (int)(Math.random()*10);
                }
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<5;k++)
                {
                    System.out.print(gab[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
}