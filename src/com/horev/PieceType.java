package com.horev;

/**
 * This class represents a piece belonging to one of the players.
 * @author Aviad Bagno
 * @
 */
class PieceType {
    private int type;
    private Color color;

    public PieceType(int type, Color color) {
        this.type = type;
        this.color = color;
    }

    public int getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }
}
