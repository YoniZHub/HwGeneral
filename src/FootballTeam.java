import java.util.List;
import java.util.Scanner;

public class FootballTeam {
    String name;
    String country;
    String arrayPlayer[];
    int rank;

    public FootballTeam(String name,String country, int rank)
    {
        Scanner s= new Scanner(System.in);
        this.name=name;
        this.country=country;
        this.rank=rank;
        this.arrayPlayer=new String[11];
        for(int i=0;i<11;i++)
        {
            System.out.println("give name of player number "+ i);
            arrayPlayer[i]=s.nextLine();
        }
    }


    public void changeRating(int rank){
        this.rank=rank;
    }
    public void replacePlayer(String tobeReplaced,String newPlayer)
    {
        for(int i = 0 ; i < this.arrayPlayer.length ; i++)
        {
            if (tobeReplaced.equals(arrayPlayer[i]))
            {
                arrayPlayer[i]=newPlayer;
                return;
            }
        }
    }
}
