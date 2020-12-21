package it.unive.dais.po1.exercise1;

/**
 * This class represents a tic tac toe board
 *
 * @since 1.0
 */
public class TicTacToeBoard {
    private Mark board[][];
    TicTacToeBoard()
    {
        board = new Mark[3][3];
        //inizializzo la matrice
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                board[i][j] = null;
            }
        }
    }
    /**
     * Puts a mark in a given cell
     *
     * @param c the mark to put in the board
     * @param x the x coordinate of the cell to be filled
     * @param y the y coordinate of the cell to be filled
     * @return true if the cell was empty, the game was not ended (e.g., no winner yet) and
     * it filled it, false otherwise
     */
    public boolean put(Mark c, int x, int y) {
        if(getMark(x,y)==null)
        {
            board[y][x] = c;
            return true;
        }
        else
            return false;
    }

    /**
     * Returns the mark of a cell, null if empty
     * @param x the x coordinate of the cell
     * @param y the y coordinate of the cell
     * @return the mark in the given cell, null if the cell is empty
     */
    public Mark getMark(int x, int y) {
        return board[y][x];
    }

    /**
     * Returns the winner of the game
     *
     * @return the mark of the winner of the game, or null if there is not yet a winner
     */
    public Mark winner() {
        //controllo diagonale
        if(getMark(1,1) != null && (getMark(0, 0) == getMark(2, 2) && getMark(1,1) == getMark(2, 2)) || (getMark(0, 2) == getMark(2, 0) && getMark(1,1) == getMark(2, 0)))
            return getMark(1,1);
        //controllo verticale e orizzontale
        for(int i=0;i<3;i++) {
            //verticale
            if (getMark(i,0) != null && getMark(i, 1) == getMark(i, 2) && getMark(i,0) == getMark(i, 1))
                return getMark(i,0);
            //orizzontale
            if(getMark(0,i) != null && getMark(1, i) == getMark(2, i) && getMark(0,i) == getMark(1, i))
                return getMark(0,i);
        }
        return null;
    }

    /**
     * Returns true if the board is full
     *
     * @return true iff the board is full
     */
    public boolean isFull() {
        boolean bFull = true;
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                bFull = bFull & getMark(i, j) != null;
            }
        }
        return bFull;
    }

}
