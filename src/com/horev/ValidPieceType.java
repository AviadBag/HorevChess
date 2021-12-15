package com.horev;

class ValidPieceType {
    public static boolean checkValidPieceType(String piece) {
        return piece.equals("rook") || piece.equals("knight") || piece.equals("bishop") || piece.equals("queen") || piece.equals("king")
                || piece.equals("pawn");
    }
}