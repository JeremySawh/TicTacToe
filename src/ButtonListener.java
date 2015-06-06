import java.awt.event.*;
import javax.swing.*;

/*
 * The listener for the buttons in the TicTacToePanel
 * 
 * @author Jeremy Sawh
 * @version 2015-05-04
 */
public class ButtonListener implements ActionListener {

	private TicTacToeModel mModel;
	private GamePanel mPanel;
	private char mGameState;

	/**
	 * Stores reference to the game model
	 * 
	 * @param model
	 * @param panel
	 */

	public ButtonListener(TicTacToeModel model, GamePanel panel) {
		this.mModel = model;
		this.mPanel = panel;
	}

	public void actionPerformed(ActionEvent event) {
		/* Get reference to the button that was clicked */
		JButton button = (JButton) event.getSource();

		/* Get the button's location */
		String command = event.getActionCommand();
		int row = Integer.parseInt(command.substring(0, 1));
		int col = Integer.parseInt(command.substring(1, 2));
		mModel.markSquare(row, col);

		/* Mark an "X" or and "O" where button is */
		button.setText("" + mModel.getPlayer());
		/* Disable button after it was clicked */
		button.setEnabled(false);
		
		mGameState = mModel.getGameState();
		
		if (mGameState != 'I') {
			mPanel.endGame(mGameState);
		}
		else {
			/* Update player turn */
			mModel.nextPlayer();
			mPanel.refreshUI(mModel.getPlayer());
		}

	}

}
