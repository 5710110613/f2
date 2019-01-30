public class Game{
    private int gamelimit;
    private int player1;
    private int player2;
    public Game(int limit){
        gamelimit = limit;
        player1 = 0;
        player2 = 0;
    }
    public void walk(int point, int play){
        if(play == 1)
            player1 += point;
        else if(play == 2)
            player2 += point;
        if(player1 >= gamelimit)
            System.out.println("Player1 Win!!!");
        if(player2 >= gamelimit)
            System.out.println("Player2 Win!!!");
    }
}