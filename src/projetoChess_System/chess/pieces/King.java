package projetoChess_System.chess.pieces;

import projetoChess_System.boardgame.Board;
import projetoChess_System.chess.ChessPiece;
import projetoChess_System.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
