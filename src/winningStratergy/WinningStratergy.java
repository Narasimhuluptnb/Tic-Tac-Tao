package winningStratergy;

import models.Board;
import models.Player;

public interface WinningStratergy {
	public boolean checkWinner(Player p,Board b);
}
