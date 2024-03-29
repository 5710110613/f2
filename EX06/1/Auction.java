import java.util.ArrayList;
public class Auction
{
    private ArrayList<Lot> lots;
    public Auction(){ 

        lots = new ArrayList<Lot>();  
    }
    public void enterLot(int lotNum, String description){
        lots.add( new Lot(lotNum, description) );  
    }
    public void bidFor(int numlot, String name, int val){
        for(Lot lot: lots){
            if(lot.getIdNum() == numlot && val > lot.getHighestBid()){
                lot.bidFor(name, val);
                System.out.println("The bit for lot number " + numlot + " was successful");
            }
            else if( lot.getIdNum() == numlot && val < lot.getHighestBid()){
                System.out.println("Lot number " + numlot + " already has a bid of" + val);
            }
        }
    }
    public void showLots(){ 
        for (Lot lot : lots)
            System.out.println(lot.toString());
    }
    public Lot getLot(int lotNum){
        for (Lot lot : lots)
            if (lot.getIdNum() == lotNum)
                return lot;
        System.out.println("Lot number: " + lotNum + " does not exist.");
        return null;
    }
}