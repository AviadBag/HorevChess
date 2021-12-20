package com.horev;

/**
 * This class is responsible for giving the possible moves of a given piece at a given place
 */

public class PossibleMoves {
    /**
     * The main function of this class - gives the possible moves of the given piece in the given place
     * @param myCords      The chess cords of the desired piece
     * @param currentBoard The current board
     * @return             An array, containing each possible move.
     */
    static String[] getPossibleMoves(String myCords, Board currentBoard) {
        PieceType piece = currentBoard.getPiece(myCords);

        switch (piece.getType()) {
            default -> throw new RuntimeException("getPossibleMoves is unimplemented for \"" + piece.getType() + "\" piece type!");
        }
    }
}
