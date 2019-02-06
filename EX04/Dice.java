public class Dice{
    private int d;
    public Dice(){
        d = 1;

    }
    public void roll(){
       // (int)(Math.random()*6)+1;
        d = (int)(Math.random()*6)+1;
        
    }
    public int getvalue(){
        return d;

    }

}