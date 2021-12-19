package com.horev;

import java.util.Arrays;

/**
 * This class represents a chess board
 * @author Aviad Bagno
 */

public class Board {
    private final static int BOARD_WIDTH = 8;
    private final static int BOARD_HEIGHT = 8;

    private PieceType[][] board = new PieceType[BOARD_HEIGHT][BOARD_WIDTH];

    public Board() {
        initPieces();
    }

    /**
     * Puts all the pieces in their initial places
     */
    private void initPieces() {
        // White
        setPiece("a1", new PieceType("rook", Color.WHITE));
        setPiece("b1", new PieceType("knight", Color.WHITE));
        setPiece("c1", new PieceType("bishop", Color.WHITE));
        setPiece("d1", new PieceType("queen", Color.WHITE));
        setPiece("e1", new PieceType("king", Color.WHITE));
        setPiece("f1", new PieceType("bishop", Color.WHITE));
        setPiece("g1", new PieceType("knight", Color.WHITE));
        setPiece("h1", new PieceType("rook", Color.WHITE));
        setPiece("a2", new PieceType("pawn", Color.WHITE));
        setPiece("b2", new PieceType("pawn", Color.WHITE));
        setPiece("c2", new PieceType("pawn", Color.WHITE));
        setPiece("d2", new PieceType("pawn", Color.WHITE));
        setPiece("e2", new PieceType("pawn", Color.WHITE));
        setPiece("f2", new PieceType("pawn", Color.WHITE));
        setPiece("g2", new PieceType("pawn", Color.WHITE));
        setPiece("h2", new PieceType("pawn", Color.WHITE));

        // Black
        setPiece("a8", new PieceType("rook", Color.BLACK));
        setPiece("b8", new PieceType("knight", Color.BLACK));
        setPiece("c8", new PieceType("bishop", Color.BLACK));
        setPiece("d8", new PieceType("queen", Color.BLACK));
        setPiece("e8", new PieceType("king", Color.BLACK));
        setPiece("f8", new PieceType("bishop", Color.BLACK));
        setPiece("g8", new PieceType("knight", Color.BLACK));
        setPiece("h8", new PieceType("rook", Color.BLACK));
        setPiece("a7", new PieceType("pawn", Color.BLACK));
        setPiece("b7", new PieceType("pawn", Color.BLACK));
        setPiece("c7", new PieceType("pawn", Color.BLACK));
        setPiece("d7", new PieceType("pawn", Color.BLACK));
        setPiece("e7", new PieceType("pawn", Color.BLACK));
        setPiece("f7", new PieceType("pawn", Color.BLACK));
        setPiece("g7", new PieceType("pawn", Color.BLACK));
        setPiece("h7", new PieceType("pawn", Color.BLACK));
    }

    /**
     * Puts the given piece in the given place
     * @param where Where to put it? (chess coordinates)
     * @param piece The piece to put
     */
    private void setPiece(String where, PieceType piece) {
        int[] xy = ChessCoords.chessCoordinatesToXY(where);
        board[xy[1]][xy[0]] = piece;
    }

    /**
     * Returns the piece in the given coordinates
     * @param where Where to give from? (chess coordinates)
     * @return The piece
     */
    public PieceType getPiece(String where) {
        int[] xy = ChessCoords.chessCoordinatesToXY(where);
        return board[xy[1]][xy[0]];
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for (int col = 8; col >= 1; col--) {
            for (char row = 'a'; row <= 'h'; row++) {
                String coord = row+String.valueOf(col);
                PieceType piece = getPiece(coord);
                s.append(coord).append(": ").append(piece).append(", ");
            }
            s.append("\n");
        }

        return s.toString();
    }
}
