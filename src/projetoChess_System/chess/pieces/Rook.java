package projetoChess_System.chess.pieces;

import projetoChess_System.boardgame.Board;
import projetoChess_System.chess.ChessPiece;
import projetoChess_System.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
