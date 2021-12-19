package com.horev;

/**
 * This class represents a piece belonging to one of the players.
 * 
 * @author Aviad Bagno
 * @
 */
class PieceType {
    private String type;
    private Color color;

    public PieceType(String type, Color color) {
        if (ValidPieceType.checkValidPieceType(type)) {
            this.type = type;
            this.color = color;
        } else
            throw new RuntimeException("invalid piece type");
    }

    public String getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "PieceType{" +
                "type='" + type + '\'' +
                ", color=" + color +
                '}';
    }
}
