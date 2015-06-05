import java.awt.event.*;
import javax.swing.*;

/*
 * The listener for the buttons in the TicTacToePanel
 * 
 * @author Jeremy Sawh
 * @version 2015-05-04
 */
public class ButtonListener implements ActionListener{
	
	private TicTacToeModel model;
	private GamePanel panel;
	
	/**
	 * Stores reference to the game model
	 * 
	 * @param model
	 * @param panel
	 */
	
	public ButtonListener(TicTacToeModel model, GamePanel panel)
	{
		this.model = model;
		this.panel = panel;
	}
	
	public void actionPerformed(ActionEvent event)
	{
		/*Get reference to the button that was clicked*/
		JButton button = (JButton) event.getSource();
		
		/*Get the button's location*/
		String command = event.getActionCommand();
		int row = Integer.parseInt(command.substring(0,1));
		int col = Integer.parseInt(command.substring(1, 2));
		model.markSquare(row, col);
		
		/*Mark an "X" or and "O" where button is*/
		button.setText("" + model.getPlayer());
		/*Disable button after it was clicked*/
		button.setEnabled(false);
		
		/*Update player turn*/
		model.nextPlayer();
		panel.refreshUI(model.getPlayer());
		
		
		
	}

}
