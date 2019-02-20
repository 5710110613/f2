public class Bid{
    private String bidderName;
    private int value;

    public Bid(String bidName, int value){
        bidderName = bidName;
        this.value = value;


    }
    public String getBidderName(){
        return bidderName;

    }
    public int getValue(){
        return value;

    }
    

}