import java.util.ArrayList;
public class Game{
    private int p1;
    private int p2;
    private int max;
    private int turn;
    private Dice dice1;
    private Dice dice2;
    private ArrayList<Tunnel> tunnels;

    public Game(int k){
        p1 = 0;
        p2 = 0;
        max = k;
        turn = 1;
        dice1 = new Dice(); 
        dice2 = new Dice(); 
        tunnels = new ArrayList<Tunnel>();
    }
    public void addTunnel(int s_in, int s_out){
        Tunnel t = new Tunnel(s_in, s_out);
        tunnels.add(t);
    }

    public void walk(int add){
        if(turn==1){
            p1 += add;
            System.out.println("p1 "+p1);
            for(Tunnel t: tunnels){
                p1 = t.walkIn(p1);
            }
        }else if(turn==2){
            p2 += add;
            System.out.println("p2 "+p2);
            for(Tunnel t: tunnels){
                p2 = t.walkIn(p2);
            }


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