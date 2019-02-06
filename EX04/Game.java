public class Game{
    private int p1;
    private int p2;
    private int max;
    private int turn;
    private Dice dice1;
    private Dice dice2;

    public Game(int k){
        p1 = 0;
        p2 = 0;
        max = k;
        turn = 1;
        dice1 = new Dice(); 
        dice2 = new Dice(); 
    }
    public void walk(int add){
        if(turn==1){
            p1 += add;
            System.out.println("p1 "+p1);
        }else if(turn==2){
            p2 += add;
            System.out.println("p2 "+p2);
        }
        if(p1>=max){
            System.out.println("P1 winner");
        }else if(p2>=max){
            System.out.println("P2 winner");
        }

    } 
    public void play(){
        dice1.roll();
        System.out.println("dice1 "+dice1.getvalue());
        dice2.roll();
        System.out.println("dice2 "+dice2.getvalue());
        walk(dice1.getvalue()+dice2.getvalue());

        if(dice1.getvalue() != dice2.getvalue()){
            changeturn();
        }

    }
    public boolean isEnded(){
        return p1>=max||p2>=max;

        
    }
   
    public void changeturn(){
        turn = turn == 1? 2:1;

    }

}