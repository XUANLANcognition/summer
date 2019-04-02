package com.summer.lexer;

public class Lexer {

    String sourceFileString;
    private Token[] token;

    public Lexer(String sourceFileString) {
        this.sourceFileString = sourceFileString;
    }

    public Token[] createArray(){

        Context context = new Context();
        context.setLexerState(new InitState());
        context.identifierKeyword();

        return token;
    }

}
