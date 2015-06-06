/**
 * Keeps Track of the game state
 * 
 * @author Jeremy Sawh
 *
 */
public class TicTacToeModel {

	private char mPlayer;
	private char[][] mSquares;
	private static char EMPTY = ' ';
	private int mTurnsTaken;

	/**
	 * Initializes a new game of Tic Tac Toe. The first person to make move will
	 * be player X.
	 */
	public TicTacToeModel() {
		mPlayer = 'X';
		mTurnsTaken = 0;
		mSquares = new char[3][3];
		for (int i = 0; i < mSquares.length; i += 1) {
			for (int j = 0; j < mSquares[i].length; j += 1) {
				mSquares[i][j] = EMPTY;
			}
		}
	}

	/**
	 * Returns a character indicating which player's turn it is, 'X' or 'O'.
	 */
	public char getPlayer() {
		return mPlayer;
	}

	/**
	 * Changes the player whose turn it is from player X to player O or from
	 * player O to player X.
	 */
	public void nextPlayer() {
		if (mPlayer == 'X') {
			mPlayer = 'O';
		} else {
			mPlayer = 'X';
		}
	}

	/**
	 * Determines the current state of game.
	 * 
	 * @return 'X' if the game is over and was won by player X, 'O' if the game
	 *         is over and was won by player O, 'D' if the game is over and
	 *         ended in a draw, 'I' if the game is in progress (not yet over).
	 */
	public char getGameState() {
		
		// Start checking after 5 turns because the first player would have then made atleast 3 moves!
		// No point in checking before hand
		if (mTurnsTaken == 5) {
			// TODO: Replace I after with a check to see who the actual winner is!
			return 'I';
		}
		else if (mTurnsTaken == 9) {
			return 'D';
		}
		else {
			return 'I';
		}
	}

	/**
	 * Marks the specified square with an X or an O, depending on which player's
	 * turn it is.
	 */
	public void markSquare(int row, int col) {
		mSquares[row][col] = mPlayer;
		mTurnsTaken++;
	}

	/**
	 * Returns a string representation of the game's squares.
	 */
	public String toString() {
		String s = "";

		for (int i = 0; i < mSquares.length; i += 1) {
			for (int j = 0; j < mSquares[i].length; j += 1) {
				s = s + mSquares[i][j] + " ";
			}
			s += '\n';
		}
		return s;
	}

	public void reset() {
		// TODO: Reset the whole game here!
		
	}
}
