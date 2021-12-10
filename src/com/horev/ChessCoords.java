package com.horev;

/**
 * This class is responsible for treating chess coords.
 */

public class ChessCoords {
    /**
     * Makes sure that the given chess coordinates are valid.
     * @param coords The coordinates to validate. MUST BE IN LOWERCASE.
     * @return true or false.
     */
    public static boolean validateChessCoords(String coords) {
        if (coords.length() != 2) return false;
        if (coords.charAt(0) < 'a' || coords.charAt(0) > 'h') return false;
        return coords.charAt(1) >= '1' && coords.charAt(1) <= '8';
    }


    /**
     * Converts the given chess coordinates to X and Y.
     * @param chessCoords The coords. MUST BE LOWERCASE.
     * @return An array with the x and y. arr[0] is x, arr[1] is y.
     */
    public static int[] chessCoordinatesToXY(String chessCoords) {
        if (!validateChessCoords(chessCoords))
            throw new RuntimeException("Given chess coordinates " + chessCoords + " are invalid.");

        int[] arr = new int[2];
        arr[0] = chessCoords.charAt(0) - 'a';
        arr[1] = chessCoords.charAt(1) - '1';

        return arr;
    }
}
