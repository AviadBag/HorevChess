package com.horev;

class ValidPieceType {
    public static boolean checkValidPieceType(String piece) {
        if (piece == "rook" || piece == "knight" || piece == "bishop" || piece == "queen" || piece == "king"
                || piece == "pawn")
            return true;
        return false;
    }
}