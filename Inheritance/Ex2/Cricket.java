class Cricket
{
    private String players;
    private int no;
    private String umpire;
    Cricket(String players,int no,String umpire)
    {
        this.players = players;
        this.no = no;
        this.umpire = umpire;
    }
    void displ()
    {      
        System.out.println(players+" is a Player");
        System.out.println(no+" players must be availavle in the team");
        System.out.println(umpire+" is umpire ");
    }
    void hlo()
    {
        System.out.println("Hello you are here");
    }
}