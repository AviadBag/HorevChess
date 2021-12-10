package com.horev;

public class Board {
    private final static int BOARD_WIDTH = 8;
    private final static int BOARD_HEIGHT = 8;

    private PieceType[][] board = new PieceType[BOARD_HEIGHT][BOARD_WIDTH];

    public PieceType getPiece(int x, int y) {
        return board[y][x];
    }
}
