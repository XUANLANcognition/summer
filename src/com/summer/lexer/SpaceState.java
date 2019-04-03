package com.summer.lexer;

public class SpaceState extends LexerState {
    @Override
    public void init() {
        // do nothing
    }

    @Override
    public void identifierKeyword() {
        this.setTempString(this.getTempString() + this.getTempChar());
        this.context.setLexerState(Context.indentifierKeywordState);
    }

    @Override
    public void number() {
        this.setTempString(this.getTempString() + this.getTempChar());
        this.context.setLexerState(Context.numberState);
    }

    @Override
    public void string() {
        this.setTempString(this.getTempString() + this.getTempChar());
        this.context.setLexerState(Context.stringState);
    }

    @Override
    public void space() {
        // do nothing
    }

    @Override
    public void operate() {
        this.setTempString(this.getTempString() + this.getTempChar());
        this.context.setLexerState(Context.operateState);
    }

    @Override
    public void end() {
        this.context.setLexerState(Context.endState);
    }
}
