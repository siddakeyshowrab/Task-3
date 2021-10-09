package showrab;

public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;
    Cricket(String matchType, int over, Player player)
    {
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display()
    {
        System.out.println("Match type: " +matchType);
        System.out.println("Over: " +over);
        System.out.println("Player name: " +player.playerName);
        System.out.println("Jersey number: " +player.jerseyNumber);
    }
}
/*
Name: Md. Jamil Siddakey Showrab
ID: 2012020119
Section: C
Email: cse_2012020119@lus.ac.bd
Date: 11-09-2021
*/
