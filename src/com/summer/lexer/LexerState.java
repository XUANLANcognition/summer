package com.summer.lexer;

import java.util.List;

public abstract class LexerState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public void setTempString(String s) {
        this.context.setTempString(s);
    }

    public String getTempString() {
        return this.context.getTempString();
    }

    public void setTempChar(char c) {
        this.context.setTempChar(c);
    }

    public char getTempChar() {
        return this.context.getTempChar();
    }

    public List<Token> getTokenList() { return this.context.getTokenList(); }

    public void setTokenList(List<Token> tokenList) { this.context.setTokenList(tokenList);}

    public abstract void init();

    public abstract void identifierKeyword();

    public abstract void number();

    public abstract void string();

    public abstract void space();

    public abstract void operate();

    public abstract void end();
}
