package it.unive.dais.po1.exercise1;
import java.util.Scanner;
/**
 * This class represents a player of the game
 *
 * @since 1.0
 */
public class Player {
    private Mark mark;
    /**
     * Intializes a player using the given Mark
     * @param mark the mark of the player
     */
    public Player(Mark mark) {
        this.mark=mark;
    }

    /**
     * Plays a round of the game.
     *
     * @param board
     * @return true if the player was able to
     */
    public boolean play(TicTacToeBoard board) {
        int x, y;
        System.out.println("------ GIOCATORE " + (mark == Mark.getCircle()? "1" : "2") + " ------");
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci x: ");
        x = in.nextInt();
        System.out.print("Inserisci y: ");
        y = in.nextInt();
        return board.put(mark, x, y);
    }
}
