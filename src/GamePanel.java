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

	private static final long SERIAL_VERSION_UID = 1L;
	private JLabel mPlayer;
	private TicTacToePanel mPanel;
	private TicTacToeModel mModel;
	private JButton mReset;

	public GamePanel() {
		setLayout(new BorderLayout());
		mReset = new JButton("Reset");
		JToolBar toolbar = new JToolBar();
		toolbar.setRollover(true);

		mPlayer = new JLabel("Click any square to start the game!");
		mPanel = new TicTacToePanel(this);
		
		// Suggestion: Wouldn't it look a little better if the reset button were at the bottom of the screen with some padding and were a little smaller?
		add(mPanel, BorderLayout.SOUTH);
		add(mPlayer, BorderLayout.NORTH);
		add(mReset, BorderLayout.CENTER);

		mModel = new TicTacToeModel();

		ResetButtonListener listener = new ResetButtonListener(mModel);
		mReset.addActionListener(listener);
	}

	public void refreshUI(char player) {
		String s = "Player " + player + " Turn";
		mPlayer.setText(s);
	}
	
	public void endGame(char decision) {
		if (decision == 'D') { mPlayer.setText("It was a Draw!"); }
		else { mPlayer.setText("Player " + decision + " won!"); }
	}
	
}
