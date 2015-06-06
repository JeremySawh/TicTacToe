import java.awt.*;

import javax.swing.*;

/**
 * Creates the TicTacToe Game Layout
 * 
 * @author Jeremy Sawh
 * @version 2015-05-04
 * 
 */

@SuppressWarnings("serial")
public class GamePanel extends JPanel {

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


		add(mPanel, BorderLayout.CENTER);
		add(mPlayer, BorderLayout.NORTH);
		add(mReset, BorderLayout.SOUTH);

		mModel = new TicTacToeModel();

		ResetButtonListener listener = new ResetButtonListener(mModel);
		mReset.addActionListener(listener);
	}

	public void refreshUI(char player) {
		String s = "Player " + player + " Turn";
		mPlayer.setText(s);
	}

	public void endGame(char decision) {
		if (decision == 'D') {
			mPlayer.setText("It was a Draw!");
		} else {
			mPlayer.setText("Player " + decision + " won!");
		}
		
		// This thread will wait for three seconds before it exits the program after a player wins or there is a draw
		Thread finish = new Thread() {
			public void run() {
				try {
					Thread.sleep(3000);
					System.exit(0);
				}
				catch (InterruptedException e) {
					System.out.println("InterruptedException in GamePanel.endGame(): " + e.getMessage());
				}
			}
		};
		
		// Starts the thread!
		finish.start();
		
	}

}
