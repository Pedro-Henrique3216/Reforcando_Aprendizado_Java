package projetoChess_System.chess;

import projetoChess_System.boardgame.Board;
import projetoChess_System.boardgame.Piece;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }


}
