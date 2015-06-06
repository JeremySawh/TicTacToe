import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The listener for the button in the TicTacToe GUI
 * 
 * @author Jeremy Sawh
 * @version 2015-04-12
 *
 */

public class ResetButtonListener implements ActionListener {
	private TicTacToeModel mModel;

	/**
	 * Constructor for objects of class ResetButtonListener
	 * 
	 * @param panel
	 * @param model
	 */
	public ResetButtonListener(TicTacToeModel model) {
		/* Initialize Instance Variables */
		this.mModel = model;

	}

	public void actionPerformed(ActionEvent event) {
		mModel.reset();
	}
}
