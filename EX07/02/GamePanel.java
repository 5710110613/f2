import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.color.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.QuadCurve2D;


public class GamePanel extends JPanel {
	public GamePanel(){
	}

	public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.lightGray);
        g2d.fillRect(0,0,500,400);

        g2d.setColor(Color.darkGray);
        g2d.fillRect(0,299,500,170);

        g2d.setColor(Color.MAGENTA);
        g2d.fillRect(30,160,89,160);

      
        g2d.setColor(Color.WHITE);//1
        g2d.fillRect(37,170,15,15);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(57,170,15,15);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(77,170,15,15);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(97,170,15,15);

        g2d.setColor(Color.WHITE);//2
        g2d.fillRect(37,200,15,15);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(57,200,15,15);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(77,200,15,15);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(97,200,15,15);

        g2d.setColor(Color.WHITE);//3
        g2d.fillRect(37,230,15,15);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(57,230,15,15);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(77,230,15,15);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(97,230,15,15);

        g2d.setColor(Color.WHITE);//4
        g2d.fillRect(37,260,15,15);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(57,260,15,15);





        g2d.setColor(Color.orange);
        g2d.fillOval(360,80,50,50); 
        g2d.setColor(Color.yellow);
        g2d.fillOval(410,262,20,20); 

        g2d.setColor(Color.black);
        g2d.fillOval(295,315,20,20); 

        g2d.setColor(Color.black);
        g2d.fillOval(175,315,20,20); 
        
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(14F)); 
        g2d.drawOval(160, 300, 50, 50);
        
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(14F)); 
        g2d.drawOval(280, 300, 50, 50);

        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(10F));
        g2d.draw(new Line2D.Float(210,320, 275,320 ));

        g2d.setColor(Color.red);
        g2d.setStroke(new BasicStroke(7F));
        g2d.draw(new Line2D.Float(175,275, 185,275 ));

        g2d.setColor(Color.red);
        g2d.setStroke(new BasicStroke(7F));
        g2d.draw(new Line2D.Float(265,275, 275,275 ));

       // g2d.setColor(Color.black);              //4
       // g2d.setStroke(new BasicStroke(10F)); 
       // g2d.drawRect(164, 192, 80, 60);

        g2d.setColor(Color.black);              //4
        g2d.draw(new RoundRectangle2D.Double(155,190,181,70,20, 20));

       /* g2d.setColor(Color.black);
        g2d.draw(new RoundRectangle2D.Double(246,190,90,70,20, 20));
*/
        g2d.setColor(Color.black);
        g2d.fillRect(70,255,90,70);

        g2d.setColor(Color.black);
        g2d.fillRect(331,255,90,70);

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(10F));
        g2d.draw(new Line2D.Float(247,320, 247,265 ));

        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(10F));
        g2d.draw(new Line2D.Float(210,320, 275,320 ));
        /*
        // create new QuadCurve2D.Float
        QuadCurve2D q = new QuadCurve2D.Float();
        // draw QuadCurve2D.Float with set coordinates
        q.setCurve(200,250, 100,100, 210, 260);
        g2d.draw(q);
        */
    }

    
}//javac GameMain.java