import java.awt.*;

import javax.swing.*;

/**
 * This Panel contains the TicTacToe grid. Each square contains a button which
 * marks and X or and O when the player selects it.
 * 
 * @author Jeremy Sawh
 * @version 2015-06-14
 *
 */
@SuppressWarnings("serial")
public class TicTacToePanel extends JPanel {


	/**
	 * Sets up the Games User Interface
	 * 
	 * @param panel
	 */

	public TicTacToePanel(GamePanel panel) {
		TicTacToeModel model = new TicTacToeModel();
		ButtonListener listener = new ButtonListener(model, panel);
		Font font = new Font("Arial",Font.BOLD, 42);
		/* Create 3-by-3 grid */
		setLayout(new GridLayout(3, 3));

		
		/* Create nine buttons for the grid */
		for (int i = 0; i < 3; i += 1) {
			for (int j = 0; j < 3; j += 1) {
				JButton b = new JButton(" ");
				b.setFont(font);
				b.addActionListener(listener);
				b.setActionCommand("" + i + j);

				/* Place Button on Panel */
				add(b);

			}
		}
		
		// Made the board size bigger
		setPreferredSize(new Dimension(250, 350));

	}

}
