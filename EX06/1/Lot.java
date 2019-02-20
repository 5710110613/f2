import java.util.ArrayList;
public class Lot{
    private int n;
    private String m;
    private int highest;
    private ArrayList<Bid> lnum;

    public Lot(int num, String message){
        n = num;
        m = message;
        highest = 0;
        lnum = new ArrayList<Bid>();

    }
    public void bidFor(String name, int val){
        lnum.add( new Bid(name, val) );  
    }
    public String getDescription(){
        return m;

    }
    public int getHighestBid(){
        for(Bid b : lnum){
            if(b.getValue() > highest)
                highest = b.getValue();
        }
        return highest;
    }
    public int getIdNum(){
        return n;

    }
    public String toString(){
        String s = " ";
        if(lnum.isEmpty()){
               s = getIdNum() + getDescription() + "    <No bid>" ; 
        }
        else{
            for(Bid b: lnum){
                if(b.getValue() == getHighestBid())
                    s = getIdNum() + getDescription() + "Bid: " + getHighestBid() + " by " + b.getBidderName() ;
            }
        }
        return s;
    }
}