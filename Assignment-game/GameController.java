import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class GameController implements PlayerListener {
  private Board board;
  public Dice d1 = new Dice();
  public Dice d2 = new Dice();

  public int nextPos = 0;

  private Player p1;
  private Player p2;
  private Integer whofirst;
  private Player currentPlayer;
  private Player winner = null;
  private List<Sprite> players = new ArrayList<>();

  private List<GameSpriteListener> spriteListeners = new ArrayList<>();
  private List<GameControlListener> controlListeners = new ArrayList<>();

  private static GameController instance;
  public static GameController getInstance(){
    if(instance == null){
      instance = new GameController();
    }
    return instance;
  }

  public GameController() {
    try{
    board = new Board(80);

    p1 = new Player("P1", 0, board, this);
    p2 = new Player("P2", 1, board, this);

    if((whofirst = (int)(Math.random()*10000)%2)==0){
      currentPlayer = p1;
      System.out.println("Value random : "+ whofirst );
      System.out.println("Who has played : p1");
      JOptionPane.showMessageDialog(null, "You Play First : P1   " + whofirst);
      
    }else{
      currentPlayer = p2;
      System.out.println("Value random : "+ whofirst );
      System.out.println("Who has played : p2");
      JOptionPane.showMessageDialog(null, "You Play First : P2   " + whofirst);
     }


    
    players.add(p1);
    players.add(p2);  
    }catch(Exception e){}
  }

  private void rollDice() {
    
      d1.roll();
      d2.roll();
  }

  public void takeTurn() {
    if(winner != null)
      return;

    rollDice();
    currentPlayer.walk(d1.getFace() + d2.getFace());
    System.out.println(d1.getFace());
    System.out.println(d2.getFace());
  }

  private void changeTurn() {
    if(d1.getFace() != d2.getFace()/* || nextPos == 39 || nextPos == 7 || nextPos == 9 || nextPos == 14*/){

      if (currentPlayer == p1)
        currentPlayer = p2;
 
      else
        currentPlayer = p1;
    }

  }

  @Override
  public void walking(Player owner){
    notifyGamePlayEnabled(false);
    for(GameSpriteListener listener : spriteListeners){
      listener.spriteUpdated();
    }
  }

  @Override
  public void walkCompleted(Player onwer) { 
    if(currentPlayer.getNextPos() == 11 || currentPlayer.getNextPos()  == 22 || currentPlayer.getNextPos()  == 45 || currentPlayer.getNextPos()  == 52){
      nochangeTurn();
    }
    else{
      changeTurn();
    }
    notifyGamePlayEnabled(true);
  }

  @Override
  public void hasWon(Player owner) {
    if (winner == null) { // first winner only
      winner = owner;
      JOptionPane.showMessageDialog(null, "Winner is " + owner);
    }
  }

  public Player getWinner() {
    return winner;
  }

  public Player getCurrentPlayer() {
    return currentPlayer;
  }

  public List<Sprite> getSprites(){
    return players;
  }

  public void addSpriteListener(GameSpriteListener listener){
    spriteListeners.add(listener);
  }

  public void addControlListener(GameControlListener listener){
    controlListeners.add(listener);
  }

  public void notifyGamePlayEnabled(boolean enabled){
    for(GameControlListener listener : controlListeners){
      listener.changeGamePlayEnabled(enabled);
    }
  }

  public void setnxpos(int nxp){
    nextPos = nxp;
  }

  private void nochangeTurn() {
    //if(d1.getFace() != d2.getFace()/* || nextPos == 39 || nextPos == 7 || nextPos == 9 || nextPos == 14*/){

      if (currentPlayer == p1)
        currentPlayer = p1;
 
      else
        currentPlayer = p2;
    //}
    }
}