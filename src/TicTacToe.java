import javax.swing.JFrame;


/**
 * Main method for the TicTacToe Game
 * @author Jeremy Sawh
 * @version 2015-05-04
 *
 */
public class TicTacToe {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Tic Tac Toe");
		GamePanel panel = new GamePanel();
		
		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

}
