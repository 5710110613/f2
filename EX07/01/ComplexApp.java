import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComplexApp {
	private static final String[] FACES = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
	public static void main(String[] args){
		JFrame frame = new JFrame("My App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		
		JPanel facesPanel = new JPanel();
		GridLayout layout = new GridLayout(0, 3);
		layout.setHgap(5);
        layout.setVgap(2);
        
        
		facesPanel.setLayout(layout);
        JButton faceButton;
        JTextField textField = new JTextField();
		for(String face : FACES){
            faceButton = new JButton(face);
            faceButton.addActionListener(new FaceActionListener(textField, face));
            
            facesPanel.add(faceButton);
		}

		frame.getContentPane().setLayout(new BorderLayout());
		
		
		textField.setFont(textField.getFont().deriveFont(24.0f));
		frame.add(textField, BorderLayout.PAGE_START);
		
		frame.add(facesPanel, BorderLayout.CENTER);
		
        JButton button = new JButton("Done");
        button.addActionListener(new DoneActionListener(textField));
		button.setPreferredSize(new Dimension(100, 50));
		frame.add(button, BorderLayout.PAGE_END);
		
		frame.setVisible(true);
	}
}
class FaceActionListener implements ActionListener{
    private JTextField textField;
    private String face;
    public FaceActionListener(JTextField textField, String face){
        this.textField = textField;
        this.face = face;
    }
    public void actionPerformed(ActionEvent e){
        textField.setText(textField.getText() + face);
    }
}
class DoneActionListener implements ActionListener{
    private JTextField textField;
    public DoneActionListener(JTextField textField){
        this.textField = textField;
    }
    public void actionPerformed(ActionEvent e){
        textField.setText("");
    }
}