package com.summer.lexer;

public abstract class LexerState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void init();

    public abstract void identifierKeyword();

    public abstract void number();

    public abstract void string();

    public abstract void space();

    public abstract void operate();

    public abstract void end();
}
