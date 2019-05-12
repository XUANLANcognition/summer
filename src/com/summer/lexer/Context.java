package com.summer.lexer;

import java.util.ArrayList;
import java.util.List;

public class Context {
    public final static InitState initState = new InitState();
    public final static IdentifierKeywordState indentifierKeywordState = new IdentifierKeywordState();
    public final static NumberState numberState = new NumberState();
    public final static StringState stringState = new StringState();
    public final static SpaceState spaceState = new SpaceState();
    public final static OperateState operateState = new OperateState();
    public final static EndState endState = new EndState();

    private LexerState lexerState;
    private String tempString = "";
    private char tempChar;
    private List<Token> tokenList = new ArrayList<Token>();

    public void Context() {
    }

    public LexerState getLexerState() {
        return lexerState;
    }

    public void setLexerState(LexerState lexerState) {
        this.lexerState = lexerState;

        this.lexerState.setContext(this);
    }

    public void init() {
        this.lexerState.init();
    }

    ;

    public void identifierKeyword() {
        this.lexerState.identifierKeyword();
    }

    ;

    public void number() {
        this.lexerState.number();
    }

    ;

    public void string() {
        this.lexerState.string();
    }

    ;

    public void space() {
        this.lexerState.space();
    }

    ;

    public void operate() {
        this.lexerState.operate();
    }

    ;

    public void end() {
        this.lexerState.end();
    }

    ;

    public String getTempString() {
        return tempString;
    }

    public void setTempString(String tempString) {
        this.tempString = tempString;
    }

    public char getTempChar() {
        return tempChar;
    }

    public void setTempChar(char tempChar) {
        this.tempChar = tempChar;
    }

    public void setTokenList(List<Token> tokenList) {
        this.tokenList = tokenList;
    }

    public List<Token> getTokenList() {
        return tokenList;
    }

    @Override
    public String toString() {
        return "Context{" +
                "lexerState=" + lexerState +
                '}';
    }
}
