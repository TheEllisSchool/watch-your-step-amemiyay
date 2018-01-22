import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class MineDuster extends JFrame {
	
	public MineDuster() {
		initGUI();
		
		setTitle("Mine Duster");
		setSize(700, 200); 
		setResizable(false);
		pack();
		setLocationRelativeTo(null);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void initGUI() {
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(Color.white);
		add(titlePanel);
		
		JLabel titleLabel = new JLabel("Mine Duster");
		Font titleFont = new Font ("Times New Roman", Font.PLAIN, 16);
		titleLabel.setFont(titleFont);
		titleLabel.setForeground(Color.black);
		titlePanel.add(titleLabel);

		
	}

	
	public static void main(String[] args) {
		try {
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch ( Exception e) {}
        
        EventQueue.invokeLater(new Runnable (){
            @Override
            public void run() {
                new MineDuster();
            }   
        });

	}
}
