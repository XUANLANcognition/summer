package com.summer.lexer;

import com.summer.*;

public class Word extends Token {

    private String lexeme;

    public static final Word
            // Operate
    and = new Word(Tag.ADD, "+"),
    minus = new Word(Tag.MINUS, "-"),
    multiply = new Word(Tag.MULTIPLY, "*"),
    divide = new Word(Tag.DIVIDE, "/"),
    equal = new Word(Tag.EQUAL, "=="),
    semicolon = new Word(Tag.SEMICOLON, ";"),
    openBrace = new Word(Tag.OPEN_BRACE, "("),
    closeBrace = new Word(Tag.CLOSE_BRACE, ")"),
    openParen = new Word(Tag.OPEN_PAREN, "{"),
    closeParen = new Word(Tag.CLOSE_PAREN, "}"),
    openBracket = new Word(Tag.OPEN_BRACKET, "["),
    closeBracket = new Word(Tag.CLOSE_BRACKET, "]"),
    comma = new Word(Tag.COMMA, "."),
    rFor = new Word(Tag.FOR, "for"),
    rWhile = new Word(Tag.WHILE, "while"),
    rIf = new Word(Tag.IF, "if")
    ;

    public Word(Tag tag, String lexeme) {
        super(tag);
        this.lexeme = lexeme;
    }

    @Override
    public String toString() {
        return super.toString() + " [lexeme : " + lexeme + "]";
    }

    public String getLexeme() {
        return lexeme;
    }

}
