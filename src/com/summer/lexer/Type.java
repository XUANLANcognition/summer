package com.summer.lexer;

public class Type extends Word {

    int width = 0;

    public static final Type
    rInt = new Type(Tag.BASIC, "int", 4),
    rFloat = new Type(Tag.BASIC, "float", 8),
    rBool = new Type(Tag.BASIC, "bool", 1);

    public Type(Tag tag, String lexeme, int width) {
        super(tag, lexeme);
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() + " [width : " + width + "]";
    }
}
