import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class ControlPanel extends JPanel implements GameControlListener{
  private GameController gc;
  private JButton playButton;
  private JLabel playerLabel;
  private JLabel playerscore;

  public ControlPanel(){
    gc = GameController.getInstance();
    gc.addControlListener(this);

    JButton exitButton = new JButton("Exit");
    exitButton.addActionListener(new ActionListener(){    
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(1);
      }
    });

    playButton = new JButton("Play");
    playButton.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        gc.takeTurn();
      }
    });
    playerscore = new JLabel("", SwingConstants.CENTER);
    playerscore.setFont(playerscore.getFont().deriveFont(16.0f));
    


    playerLabel = new JLabel("", SwingConstants.CENTER);
    playerLabel.setFont(playerLabel.getFont().deriveFont(16.0f));
    updatePlayerLabel();
    setLayout(new GridLayout(0, 1));
    add(exitButton);
    add(playerLabel);
    add(playerscore);
    add(playButton);    
  }

  public void changeGamePlayEnabled(boolean enabled){
    playButton.setEnabled(enabled);
    updatePlayerLabel();
    updatescore();
  }

  private void updatePlayerLabel(){
    playerLabel.setText(gc.getCurrentPlayer().toString());
  }
  private void updatescore(){
    playerscore.setText("D1: " +gc.d1.getFace() + " D2: " + gc.d2.getFace()+ "= " + Integer.toString(gc.d1.getFace()+gc.d2.getFace()));
    

  }

}