import java.awt.*;
import javax.swing.*;


/**
 * Creates the TicTacToe Game Layout 
 * 
 * @author Jeremy Sawh
 * @version 2015-05-04
 * 
 */


public class GamePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JLabel player;
	private TicTacToePanel panel;
	private TicTacToeModel model;
	private JButton reset;
	
	public GamePanel()
	{
		setLayout(new BorderLayout());
		reset = new JButton("Reset");
		JToolBar toolbar = new JToolBar();
		toolbar.setRollover(true);
		
		player = new JLabel(" ");
		panel = new TicTacToePanel(this);
		
		add(panel, BorderLayout.SOUTH); 
		add(player, BorderLayout.NORTH);  
		add(reset, BorderLayout.CENTER);
		
		model = new TicTacToeModel();
		
       ResetButtonListener listener = new ResetButtonListener(model);
       reset.addActionListener(listener);
	}
	
	public void refreshUI(char Player)
	{
		String s = "Players " + Player + " Turn";
		player.setText(s);
		
	}
}
