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
public class TicTacToePanel extends JPanel {

	private static final long SERIAL_VERSION_UID = 1L;

	/**
	 * Sets up the Games User Interface
	 * 
	 * @param panel
	 */

	public TicTacToePanel(GamePanel panel) {
		TicTacToeModel model = new TicTacToeModel();
		ButtonListener listener = new ButtonListener(model, panel);

		/* Create 3-by-3 grid */
		setLayout(new GridLayout(3, 3));

		/* Create nine buttons for the grid */
		for (int i = 0; i < 3; i += 1) {
			for (int j = 0; j < 3; j += 1) {
				JButton b = new JButton(" ");
				b.addActionListener(listener);
				b.setActionCommand("" + i + j);

				/* Place Button on Panel */
				add(b);

			}
		}
		
		// Made the board size bigger
		setPreferredSize(new Dimension(400, 400));

	}

}
