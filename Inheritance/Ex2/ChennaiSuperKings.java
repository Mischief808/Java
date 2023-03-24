class ChennaiSuperKings extends Cricket
{ 
    private int num;
    private String coach;
    ChennaiSuperKings(int no,String players,String umpire,int num,String coach)
    {
        super(players,no,umpire);
        this.num = num;
        this.coach = coach;
       
    }
    void show()
    {
        System.out.println("The toatl no.of.players in team are "+num);
        System.out.println(coach+" is the coach of the team");
    }

}