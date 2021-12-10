package com.horev;

class ValidPieceType {
    public static boolean checkValidPieceType(String piece) {
        if (piece.equals("rook") || piece.equals("knight") || piece.equals("bishop") || piece.equals("queen") || piece.equals("king")
                || piece.equals("pawn"))
            return true;
        return false;
    }
}